package com.lifeix.football.games.module.referee.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.Referee;
import com.lifeix.football.games.module.referee.service.RefereeService;

@RestController
@RequestMapping("/referees")
public class RefereeController {

    @Autowired
    private RefereeService refereeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Cacheable(value = "referees", keyGenerator = "wiselyKeyGenerator")
    public Map<String, List<Referee>> getReferees(
            @RequestParam(value = "level", required = true) String level,
            @RequestParam(value = "startId", defaultValue = "0", required = false) Long startId,
            @RequestParam(value = "pageSize", defaultValue = "40", required = false) Integer pageSize) {

        return refereeService.getReferees(level, startId, pageSize);
    }

    @RequestMapping(value = "/{refereeId}", method = RequestMethod.GET)
    @Cacheable(value = "referee", keyGenerator = "wiselyKeyGenerator")
    public Referee findReferee(@PathVariable(value = "refereeId") Long id) {
        return refereeService.findOne(id);
    }

}
