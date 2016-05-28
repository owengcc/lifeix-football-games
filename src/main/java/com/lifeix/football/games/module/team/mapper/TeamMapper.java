package com.lifeix.football.games.module.team.mapper;

import java.util.List;

import com.lifeix.football.games.model.Team;
import com.lifeix.football.games.model.TeamInfo;

public interface TeamMapper {

    public Team findOne(Long id);

    public List<Team> findOne(List<Long> teamIds);

    public Team findSimpleOne(Long id);

    public List<TeamInfo> findTeamsByCategoryId(Long categoryId);

    public List<TeamInfo> findTeamsByCoachId(Long coachId);

    public List<TeamInfo> findTeamsByPlayerId(Long playerId);

    public List<TeamInfo> findTeamsByStaffId(Long staffId);

}
