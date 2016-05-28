package com.lifeix.football.games.module.competition.service;

import java.util.List;

import com.lifeix.football.games.model.Match;
import com.lifeix.football.games.model.MatchInfo;

public interface MatchService {

    public Match finfOne(Long id);

    public List<MatchInfo> findByCompetitionId(Long competitionId, Long teamId);
}
