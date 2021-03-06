package com.lifeix.football.games.module.competition.service;

import java.util.List;

import com.lifeix.football.games.model.Match;
import com.lifeix.football.games.model.MatchInfo;

public interface MatchService {

    public Match findOne(Long id);

    public List<MatchInfo> findByCompetitionIdAndTeamId(Long competitionId, Long teamId);

}
