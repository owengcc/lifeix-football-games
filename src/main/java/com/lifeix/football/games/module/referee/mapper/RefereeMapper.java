package com.lifeix.football.games.module.referee.mapper;

import java.util.List;

import com.lifeix.football.games.model.Referee;
import com.lifeix.football.games.module.referee.po.RefereePO;

public interface RefereeMapper {

    public RefereePO findOne(Long id);

    public List<Referee> list(String level, Long startId, Integer pageSize);

}
