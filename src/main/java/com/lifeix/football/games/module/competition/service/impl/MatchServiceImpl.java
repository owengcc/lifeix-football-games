package com.lifeix.football.games.module.competition.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.Match;
import com.lifeix.football.games.model.MatchInfo;
import com.lifeix.football.games.model.MatchStaff;
import com.lifeix.football.games.model.MatchTeam;
import com.lifeix.football.games.model.Referee;
import com.lifeix.football.games.module.competition.mapper.MatchMapper;
import com.lifeix.football.games.module.competition.mapper.MatchTeamMapper;
import com.lifeix.football.games.module.competition.service.MatchService;
import com.lifeix.football.games.module.competition.service.MatchTeamService;
import com.lifeix.football.games.module.referee.service.RefereeService;
import com.lifeix.football.games.module.staff.mapper.MatchStaffMapper;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchMapper matchMapper;

    @Autowired
    private MatchTeamMapper matchTeamMapper;

    @Autowired
    private RefereeService refereeService;

    @Autowired
    private MatchTeamService matchTeamService;

    @Autowired
    private MatchStaffMapper matchStaffMapper;

    @Override
    public Match findOne(Long id) {
        Match match = new Match();
        MatchInfo matchInfo = matchMapper.findOne(id);
        // 球队
        Long hostTeamId = matchInfo.getHostTeam().getId();
        MatchTeam hostTeam = matchTeamService.findMatchTeam(hostTeamId);
        Long awayTeamId = matchInfo.getAwayTeam().getId();
        MatchTeam awayTeam = matchTeamService.findMatchTeam(awayTeamId);
        BeanUtils.copyProperties(matchInfo, match, new String[] { "hostTeam,awayTeam" });
        match.setHostTeam(hostTeam);
        match.setAwayTeam(awayTeam);
        // 裁判
        List<Referee> referees = refereeService.findByMathchId(id);
        List<Referee> sideReferees = new ArrayList<Referee>();
        for (Referee referee : referees) {
            if ("chief".equals(referee.getPosition())) {
                match.setChiefReferee(referee);
            }
            if ("side".equals(referee.getPosition())) {
                sideReferees.add(referee);
            }
            if ("fourth".equals(referee.getPosition())) {
                match.setFourthReferee(referee);
            }
        }
        match.setSideReferees(sideReferees);
        // 比赛工作人员
        List<MatchStaff> matchStaffs = matchStaffMapper.findByMatchId(id);
        for (MatchStaff matchStaff : matchStaffs) {
            if ("bsjd".equals(matchStaff.getPosition())) {
                match.setBsjd(matchStaff);
            }
            if ("cpjd".equals(matchStaff.getPosition())) {
                match.setCpjd(matchStaff);
            }
        }
        return match;
    }

    @Override
    public List<MatchInfo> findByCompetitionIdAndTeamId(Long competitionId, Long teamId) {
        List<Long> matchTeamIds = new ArrayList<Long>();
        matchTeamIds = matchTeamMapper.findMatchTeamIdsByTeamId(teamId);
        List<MatchInfo> lists = matchMapper.findByCompetitionIdAndMatchTeamIds(competitionId, matchTeamIds);
        return lists;
    }

}
