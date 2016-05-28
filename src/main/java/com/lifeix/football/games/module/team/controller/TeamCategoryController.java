package com.lifeix.football.games.module.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.TeamCategory;
import com.lifeix.football.games.module.team.service.TeamCategoryService;

@RestController
@RequestMapping("/teams/category")
public class TeamCategoryController {

    @Autowired
    private TeamCategoryService teamCategoryService;

    @RequestMapping(value = "/{teamCategoryId}", method = RequestMethod.GET)
    public TeamCategory findOne(@PathVariable(value = "teamCategoryId") Long teamCategoryId,
            @RequestParam(value = "isLeaf", defaultValue = "0", required = false) Integer isLeaf) {
        if (isLeaf == 1) {
            return teamCategoryService.findOneOnlyHaveLeaf(teamCategoryId);
        }
        return teamCategoryService.findOne(teamCategoryId);
    }
}
