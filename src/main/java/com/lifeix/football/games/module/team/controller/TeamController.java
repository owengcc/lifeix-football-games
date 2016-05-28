package com.lifeix.football.games.module.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.Team;
import com.lifeix.football.games.module.team.service.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    private TeamService service;

    @RequestMapping(value = "/{teamId}", method = RequestMethod.GET)
    public Team findOne(@PathVariable(value = "teamId") Long id) {
        return service.findOne(id);
    }

}
