package com.lifeix.football.games.module.coach.mapper;

import java.util.List;

import com.lifeix.football.games.model.Coach;

public interface CoachMapper {

    public Coach findOne(Long id);

    public List<Coach> findCoachByLevel(String level, Long startId, Integer pageSize);

    public List<Coach> findCoachByTeamId(Long teamId);

    public List<Coach> findCoachByCompetitionTeamId(Long competitionTeamId);

    public List<Coach> findCoachByMatchTeamId(Long matchTeamId);

}
