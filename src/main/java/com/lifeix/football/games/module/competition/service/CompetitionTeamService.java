package com.lifeix.football.games.module.competition.service;

import com.lifeix.football.games.model.CompetitionTeam;

public interface CompetitionTeamService {

    public CompetitionTeam findOne(Long competitionId, Long teamId);
}
