package com.lifeix.football.games.module.competition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.Competition;
import com.lifeix.football.games.module.competition.service.CompetitionService;

@RestController
@RequestMapping("/competitions")
public class CompetitionController {
    @Autowired
    private CompetitionService competitionService;

    @RequestMapping(value = "/{competitionId}", method = RequestMethod.GET)
    public Competition findCompetition(@PathVariable(value = "competitionId") Long competitionId) {
        return competitionService.findOne(competitionId);
    }
}
