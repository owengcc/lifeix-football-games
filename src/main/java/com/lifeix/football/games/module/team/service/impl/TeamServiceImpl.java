package com.lifeix.football.games.module.team.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.Team;
import com.lifeix.football.games.module.team.mapper.TeamMapper;
import com.lifeix.football.games.module.team.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamMapper mappper;

    @Override
    public Team findOne(Long id) {
        return mappper.findOne(id);
    }

}
