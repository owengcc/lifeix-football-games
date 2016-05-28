package com.lifeix.football.games.module.competition.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.Coach;
import com.lifeix.football.games.model.CompetitionTeam;
import com.lifeix.football.games.model.PlayerInfo;
import com.lifeix.football.games.model.Staff;
import com.lifeix.football.games.module.coach.mapper.CoachMapper;
import com.lifeix.football.games.module.competition.mapper.CompetitionTeamMapper;
import com.lifeix.football.games.module.competition.service.CompetitionTeamService;
import com.lifeix.football.games.module.player.mapper.PlayerMapper;
import com.lifeix.football.games.module.staff.mapper.StaffMapper;

@Service
public class CompetitionTeamServiceImpl implements CompetitionTeamService {
    @Autowired
    private CompetitionTeamMapper competitionTeamMapper;

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private CoachMapper coachMapper;

    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public CompetitionTeam findOne(Long competitionId, Long teamId) {
        CompetitionTeam competitionTeam = competitionTeamMapper.findOne(competitionId, teamId);
        if (competitionTeam == null) {
            return null;
        }
        Long competitionTeamId = competitionTeam.getId();
        // 职员
        List<Staff> staffs = staffMapper.findStaffByCompetitionTeamId(competitionTeamId);
        for (Staff staff : staffs) {
            if ("teamleader".equals(staff.getPosition())) {
                competitionTeam.setTeamLeader(staff);
            }
            if ("doctor".equals(staff.getPosition())) {
                competitionTeam.setDoctor(staff);
            }
        }
        // 教练
        List<Coach> coaches = coachMapper.findCoachByCompetitionTeamId(competitionTeamId);
        for (Coach coach : coaches) {
            if ("chief".equals(coach.getPosition().trim())) {
                competitionTeam.setChiefCoach(coach);
            }
            if ("assistant".equals(coach.getPosition().trim())) {
                competitionTeam.setAssistantCoach(coach);
            }
            if ("gk".equals(coach.getPosition().trim())) {
                competitionTeam.setGkCoach(coach);
            }
        }
        // 球员
        List<PlayerInfo> players = playerMapper.findPlayerByCompetitionTeamId(competitionTeamId);
        competitionTeam.setPlayers(players);
        return competitionTeam;
    }
}