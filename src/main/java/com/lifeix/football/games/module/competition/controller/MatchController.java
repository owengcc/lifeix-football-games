package com.lifeix.football.games.module.competition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.Match;
import com.lifeix.football.games.model.MatchInfo;
import com.lifeix.football.games.module.competition.service.MatchService;

@RestController
@RequestMapping("/competitions/{competitionId}/matches")
public class MatchController {
    @Autowired
    private MatchService matchService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @Cacheable(value = "matches", keyGenerator = "wiselyKeyGenerator")
    public List<MatchInfo> findByCompetitionIdAndTeamId(
            @PathVariable(value = "competitionId") Long competitionId,
            @RequestParam(value = "teamId", required = true) Long teamId) {
        return matchService.findByCompetitionIdAndTeamId(competitionId, teamId);
    }

    @RequestMapping(value = "/{matchId}", method = RequestMethod.GET)
    @Cacheable(value = "match", keyGenerator = "wiselyKeyGenerator")
    public Match findMatchTeam(@PathVariable(value = "matchId") Long matchId) {
        return matchService.findOne(matchId);
    }
}
