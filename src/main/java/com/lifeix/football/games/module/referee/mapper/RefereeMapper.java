package com.lifeix.football.games.module.referee.mapper;

import java.util.List;

import com.lifeix.football.games.model.Referee;

public interface RefereeMapper {

    public Referee findOne(Long id);

    public List<Referee> list(String level, Long startId, Integer pageSize);

    public List<Referee> findByMathchId(Long matchId);

}
