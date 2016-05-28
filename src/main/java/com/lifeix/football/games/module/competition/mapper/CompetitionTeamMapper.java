package com.lifeix.football.games.module.competition.mapper;

import java.util.List;

import com.lifeix.football.games.model.CompetitionTeam;
import com.lifeix.football.games.model.CompetitionTeamInfo;

public interface CompetitionTeamMapper {

    public CompetitionTeam findOne(Long competitionId, Long teamId);

    public CompetitionTeam findById(Long id);

    public List<CompetitionTeamInfo> findByCompetitionId(Long competitionId);

}
