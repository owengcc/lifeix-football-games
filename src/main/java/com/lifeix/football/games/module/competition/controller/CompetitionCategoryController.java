package com.lifeix.football.games.module.competition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.CompetitionCategory;
import com.lifeix.football.games.module.competition.service.CompetitionCategoryService;

@RestController
@RequestMapping("/competitionCategory")
public class CompetitionCategoryController {
    @Autowired
    private CompetitionCategoryService competitionCategoryService;

    @RequestMapping(value = "/{competitionCategoryId}", method = RequestMethod.GET)
    public CompetitionCategory findOne(
            @PathVariable(value = "competitionCategoryId") Long competitionCategoryId) {
        return competitionCategoryService.findOne(competitionCategoryId);
    }
}
