package com.lifeix.football.games.module.parse.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lifeix.football.games.module.parse.service.PlayerParseService;
import com.lifeix.football.games.module.player.mapper.PlayerMapper;
import com.lifeix.football.games.module.player.mapper.PlayerNationalMatchMapper;
import com.lifeix.football.games.module.player.mapper.TeamPlayerMapper;
import com.lifeix.football.games.module.player.po.PlayerNationalMatchPO;
import com.lifeix.football.games.module.player.po.PlayerPO;
import com.lifeix.football.games.module.team.po.TeamPlayerPO;

@Service
public class PlayerParserServiceImpl implements PlayerParseService {
    @Autowired
    private PlayerMapper playerMapper;

    @Autowired
    private TeamPlayerMapper teamPlayerMapper;

    @Autowired
    private PlayerNationalMatchMapper playerNationalMatchMapper;

    @Override
    public void insetPlayers() throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String prefix = "http://cfa.sodasoccer.com/";
        // 球员信息列表
        Set<String> players = new HashSet<String>();
        Document doc = Jsoup.connect("http://cfa.sodasoccer.com/players/2016-05-30.html").get();
        Elements elements = doc.getElementsByTag("a");
        for (Element element : elements) {
            String str = element.attr("href");
            if (str.contains("player/")) {
                players.add(prefix + str.substring(2, str.length()));
            }
        }

        for (String player : players) {
            Document docPlayer = Jsoup.connect(player).get();
            String name = docPlayer.getElementsByTag("h1").text();
            Elements attrs = docPlayer.getElementsByAttributeValue("class", "xin");
            Element element = attrs.get(0);

            String nameStr = element.child(0).childNode(1).toString();
            String englishName = nameStr.substring(2, nameStr.length());

            String birthDay = element.child(1).childNode(1).toString();
            String position = element.child(1).childNode(2).childNode(1).childNode(0).toString();

            String height = element.child(2).childNode(1).toString();
            String weight = element.child(2).childNode(2).childNode(1).childNode(0).toString();

            String birthPlace = element.child(3).childNode(1).toString();

            PlayerPO po = new PlayerPO();
            po.setName(name);
            po.setEnglishName(englishName);

            po.setBirthday(format.parse(birthDay));
            po.setWeight(Integer.parseInt(weight.trim().substring(0, 2)));
            po.setHeight(Integer.parseInt(height.trim().substring(0, 3)));
            po.setBirthplace(birthPlace);

            // 其他信息
            po.setCountry("中国");
            po.setSex("男");
            po.setEnglishName(englishName);
            po.setAvatar(englishName + ".jpg");
            playerMapper.insertOne(po);

            Long playerId = Long.parseLong(po.getId());
            Long teamId = 1l;
            TeamPlayerPO teamPlayerPO = new TeamPlayerPO();
            teamPlayerPO.setCreateDate(new Date());
            teamPlayerPO.setPlayerId(playerId);
            teamPlayerPO.setTeamId(teamId);
            teamPlayerPO.setPosition(position);
            teamPlayerMapper.insertOne(teamPlayerPO);

            PlayerNationalMatchPO nationalMatchPo = new PlayerNationalMatchPO();
            nationalMatchPo.setPlayerId(playerId);
            Elements trs = docPlayer.select("table").select("tr");
            for (int i = 0; i < trs.size(); i++) {
                // 主客场
                String state = trs.get(i).attr("sid");
                if (StringUtils.isEmpty(state)) {
                    continue;
                }
                Elements tds = trs.get(i).select("td");
                // 比分 对手
                String scoreStr = tds.get(5).text();
                String opponent = tds.get(3).text();
                String[] scores = scoreStr.split(":");
                if ("home".equals(state.trim())) {
                    nationalMatchPo.setHostTeam("中国");
                    nationalMatchPo.setHostScore(Integer.parseInt(scores[0]));
                    nationalMatchPo.setAwayTeam(opponent);
                    nationalMatchPo.setAwayScore(Integer.parseInt(scores[1]));
                }
                if ("away".equals(state.trim())) {
                    nationalMatchPo.setAwayTeam("中国");
                    nationalMatchPo.setAwayScore(Integer.parseInt(scores[0]));
                    nationalMatchPo.setHostTeam(opponent);
                    nationalMatchPo.setHostScore(Integer.parseInt(scores[1]));
                }

                // 比赛时间
                Date matchDate = format.parse(tds.get(0).text());
                nationalMatchPo.setMatchDate(matchDate);
                // 赛事 亚洲杯 东亚杯 亚预 友谊赛 世预亚
                String competitionName = tds.get(1).text();
                Long competitionId = selectCompetition(competitionName);
                nationalMatchPo.setCompetitionId(competitionId);
                // 首发
                String first = tds.get(7).text();
                if ("首发".equals(first.trim())) {
                    nationalMatchPo.setFirst(1);
                } else {
                    nationalMatchPo.setFirst(2);
                }
                // 上场时间
                String showTime = tds.get(8).text();
                nationalMatchPo.setShowTime(Integer.parseInt(showTime));
                // goal
                String goal = tds.get(9).text();
                if ("-".equals(goal.trim())) {
                    nationalMatchPo.setGoal(0);
                } else {
                    nationalMatchPo.setGoal(Integer.parseInt(goal));
                }
                // assists
                String assists = tds.get(10).text();
                if ("-".equals(assists.trim())) {
                    nationalMatchPo.setAssists(0);
                } else {
                    nationalMatchPo.setAssists(Integer.parseInt(assists));
                }
                // 红黄牌
                String card = tds.get(11).html();
                if (!StringUtils.isEmpty(card)) {
                    if (card.contains("red_card")) {
                        nationalMatchPo.setDismissal(1);
                    } else {
                        nationalMatchPo.setDismissal(0);
                    }
                    if (card.contains("Yellow_card")) {
                        nationalMatchPo.setBooking(1);
                    } else {
                        nationalMatchPo.setBooking(0);
                    }
                } else {
                    nationalMatchPo.setDismissal(0);
                    nationalMatchPo.setBooking(0);
                }
                playerNationalMatchMapper.insertOne(nationalMatchPo);
            }
        }
    }

    private Long selectCompetition(String name) {
        if ("亚洲杯".equals(name)) {
            return 1l;
        }
        if ("东亚杯".equals(name)) {
            return 2l;
        }
        if ("亚预".equals(name)) {
            return 3l;
        }
        if ("友谊赛".equals(name)) {
            return 4l;
        }
        return 5l;
    }

}
