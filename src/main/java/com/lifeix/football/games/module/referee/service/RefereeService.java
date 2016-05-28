package com.lifeix.football.games.module.referee.service;

import java.util.List;

import com.lifeix.football.games.model.Referee;

public interface RefereeService {

    public Referee findOne(Long refereeId);

    public List<Referee> list(String level, Long startId, Integer limit);
}
