package com.lifeix.football.games.module.competition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.CompetitionTeam;
import com.lifeix.football.games.module.competition.service.CompetitionTeamService;

@RestController
@RequestMapping("/competitions/{competitionId}/teams")
public class CompetitionTeamController {
    @Autowired
    private CompetitionTeamService competitionTeamService;

    @RequestMapping(value = "/{teamId}/competitionTeam", method = RequestMethod.GET)
    @Cacheable(value = "competitionTeam", keyGenerator = "wiselyKeyGenerator")
    public CompetitionTeam findCompetitionTeam(@PathVariable(value = "competitionId") Long competitionId,
            @PathVariable(value = "teamId") Long teamId) {
        return competitionTeamService.findOne(competitionId, teamId);
    }
}