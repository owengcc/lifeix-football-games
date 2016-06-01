package com.lifeix.football.games.module.referee.service;

import java.util.List;
import java.util.Map;

import com.lifeix.football.games.model.Referee;

public interface RefereeService {

    public Referee findOne(Long refereeId);

    public Map<String, List<Referee>> getReferees(String level, Long startId, Integer limit);

    public List<Referee> findByMathchId(Long matchId);
}
