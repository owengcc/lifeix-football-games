package com.lifeix.football.games.module.competition.mapper;

import java.util.List;

import com.lifeix.football.games.model.MatchTeam;
import com.lifeix.football.games.model.MatchTeamInfo;

public interface MatchTeamMapper {

    public List<MatchTeam> findTeams(Long competitionId, Long teamId);

    public MatchTeam findMatchTeam(Long matchTeamId);

    public MatchTeamInfo findMatchTeamInfo(Long matchTeamId);

    public List<Long> findMatchTeamIdsByTeamId(Long teamId);

}
