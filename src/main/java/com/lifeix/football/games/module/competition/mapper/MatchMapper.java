package com.lifeix.football.games.module.competition.mapper;

import java.util.List;

import com.lifeix.football.games.model.MatchInfo;

public interface MatchMapper {

    public MatchInfo findOne(Long matchId);

    public List<MatchInfo> findByCompetitionIdAndMatchTeamIds(Long competitionId, List<Long> matchTeamIds);

    public List<MatchInfo> findByCompetitionId(Long competitionId);

}
