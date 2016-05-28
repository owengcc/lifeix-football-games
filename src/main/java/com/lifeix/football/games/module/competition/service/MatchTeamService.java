package com.lifeix.football.games.module.competition.service;

import java.util.List;

import com.lifeix.football.games.model.MatchTeam;

public interface MatchTeamService {

    public List<MatchTeam> findMatchTeams(Long competitionId, Long teamId);

    public MatchTeam findMatchTeam(Long matchTeamId);
}
