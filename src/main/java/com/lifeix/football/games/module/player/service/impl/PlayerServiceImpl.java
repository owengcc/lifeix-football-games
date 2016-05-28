package com.lifeix.football.games.module.player.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.Player;
import com.lifeix.football.games.model.TeamInfo;
import com.lifeix.football.games.module.player.mapper.PlayerMapper;
import com.lifeix.football.games.module.player.service.PlayerService;
import com.lifeix.football.games.module.team.mapper.TeamMapper;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerMapper playerMapper;

    @Autowired
    private TeamMapper teamMappper;

    @Override
    public Player findOne(Long id) {
        Player player = playerMapper.findOne(id);
        // 球员属于的俱乐部和国家队
        List<TeamInfo> teamInfos = teamMappper.findTeamsByPlayerId(id);
        List<TeamInfo> clubInfos = new ArrayList<TeamInfo>();
        if (teamInfos != null && teamInfos.size() > 0) {
            for (TeamInfo teamInfo : teamInfos) {
                String name = teamInfo.getTeamCategory().getName();
                if (name.contains("国家")) {
                    player.setNationTeam(teamInfo);
                } else {
                    clubInfos.add(teamInfo);
                }
            }
            if (clubInfos.size() > 0) {
                player.setClub(clubInfos.get(0));
            }
            player.setCareer(clubInfos);
        }
        return player;
    }

}
