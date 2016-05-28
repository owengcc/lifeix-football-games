package com.lifeix.football.games.module.coach.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lifeix.football.games.model.Coach;
import com.lifeix.football.games.module.coach.service.CoachService;

@RestController
@RequestMapping("/coaches")
public class CoachController {
    @Autowired
    private CoachService coachService;

    @RequestMapping(value = "/{coachId}", method = RequestMethod.GET)
    public Coach findOne(@PathVariable(value = "coachId") Long id) {
        return coachService.findOne(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Coach> findCoachByLevel(
            @RequestParam(value = "teamCategoryId", defaultValue = "1", required = false) Long teamCategoryId,
            @RequestParam(value = "level", required = false) String level,
            @RequestParam(value = "startId", defaultValue = "0", required = false) Long startId,
            @RequestParam(value = "pageSize", defaultValue = "40", required = false) Integer pageSize) {
        List<Coach> list = coachService.findCoachByLevel(level, startId, pageSize);
        return list;
    }

    @RequestMapping(value = "/teamcategory/{teamCategoryId}", method = RequestMethod.GET)
    public Map<String, List<Coach>> findCoachByTeamCategory(
            @PathVariable(value = "teamCategoryId") Long teamCategoryId) throws JsonProcessingException {
        Map<String, List<Coach>> map = coachService.findCoachByTeamCategory(teamCategoryId);
        return map;
    }
}
