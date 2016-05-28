package com.lifeix.football.games.module.competition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.MatchTeam;
import com.lifeix.football.games.module.competition.service.MatchTeamService;

@RestController
@RequestMapping("/competitions/{competitionId}/teams")
public class MatchTeamController {
    @Autowired
    private MatchTeamService matchTeamService;

    @RequestMapping(value = "/{teamId}/matchTeam/{matchTeamId}", method = RequestMethod.GET)
    public MatchTeam findMatchTeam(@PathVariable(value = "competitionId") Long competitionId,
            @PathVariable(value = "teamId") Long teamId,
            @PathVariable(value = "matchTeamId") Long matchTeamId) {
        return matchTeamService.findMatchTeam(matchTeamId);
    }
}