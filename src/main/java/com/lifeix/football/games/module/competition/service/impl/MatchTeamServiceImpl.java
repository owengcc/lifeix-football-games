package com.lifeix.football.games.module.competition.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.Coach;
import com.lifeix.football.games.model.MatchTeam;
import com.lifeix.football.games.model.PlayerInfo;
import com.lifeix.football.games.model.Staff;
import com.lifeix.football.games.module.coach.mapper.CoachMapper;
import com.lifeix.football.games.module.competition.mapper.MatchTeamMapper;
import com.lifeix.football.games.module.competition.service.MatchTeamService;
import com.lifeix.football.games.module.player.mapper.PlayerMapper;
import com.lifeix.football.games.module.staff.mapper.StaffMapper;

@Service
public class MatchTeamServiceImpl implements MatchTeamService {

    @Autowired
    private MatchTeamMapper matchTeamMapper;

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private CoachMapper coachMapper;

    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public List<MatchTeam> findMatchTeams(Long competitionId, Long teamId) {
        return matchTeamMapper.findTeams(competitionId, teamId);
    }

    @Override
    public MatchTeam findMatchTeam(Long matchTeamId) {
        MatchTeam matchTeam = matchTeamMapper.findMatchTeam(matchTeamId);
        // 职员
        List<Staff> staffs = staffMapper.findStaffByMatchTeamId(matchTeamId);
        for (Staff staff : staffs) {
            if ("teamleader".equals(staff.getPosition())) {
                matchTeam.setTeamLeader(staff);
            }
            if ("doctor".equals(staff.getPosition())) {
                matchTeam.setDoctor(staff);
            }
        }
        // 教练
        List<Coach> coaches = coachMapper.findCoachByMatchTeamId(matchTeamId);
        List<Coach> assistantCoaches = new ArrayList<Coach>();
        for (Coach coach : coaches) {
            if ("chief".equals(coach.getPosition().trim())) {
                matchTeam.setChiefCoach(coach);
            }
            if ("assistant".equals(coach.getPosition().trim())) {
                assistantCoaches.add(coach);
            }
        }
        matchTeam.setAssistantCoach(assistantCoaches);
        // 球员
        List<PlayerInfo> firstPlayers = new ArrayList<PlayerInfo>();
        List<PlayerInfo> substitutionPlayers = new ArrayList<PlayerInfo>();
        List<PlayerInfo> players = playerMapper.findPlayerByMatchTeamId(matchTeamId);
        for (PlayerInfo playerInfo : players) {
            if (playerInfo.getFirst() == 1) {
                firstPlayers.add(playerInfo);
            } else {
                substitutionPlayers.add(playerInfo);
            }
        }
        matchTeam.setFirstPlayers(firstPlayers);
        matchTeam.setSubstitutionPlayers(substitutionPlayers);
        return matchTeam;
    }

}
