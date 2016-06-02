package com.lifeix.football.games.module.competition.service.impl;

import java.util.ArrayList;
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
            if ("领队".equals(staff.getPosition())) {
                competitionTeam.setTeamLeader(staff);
            }
            if ("队医".equals(staff.getPosition())) {
                competitionTeam.setDoctor(staff);
            }
        }
        // 教练
        List<Coach> coaches = coachMapper.findCoachByCompetitionTeamId(competitionTeamId);
        List<Coach> assistantCoaches = new ArrayList<Coach>();
        for (Coach coach : coaches) {
            if ("主教练".equals(coach.getPosition().trim())) {
                competitionTeam.setChiefCoach(coach);
            }
            if ("助理教练".equals(coach.getPosition().trim())) {
                assistantCoaches.add(coach);
            }
        }
        competitionTeam.setAssistantCoach(assistantCoaches);
        // 球员
        List<PlayerInfo> players = playerMapper.findPlayerByCompetitionTeamId(competitionTeamId);
        competitionTeam.setPlayers(players);
        return competitionTeam;
    }
}
