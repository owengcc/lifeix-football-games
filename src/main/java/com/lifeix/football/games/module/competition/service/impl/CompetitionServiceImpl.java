package com.lifeix.football.games.module.competition.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.Competition;
import com.lifeix.football.games.model.CompetitionTeamInfo;
import com.lifeix.football.games.model.MatchInfo;
import com.lifeix.football.games.module.competition.mapper.CompetitionMapper;
import com.lifeix.football.games.module.competition.mapper.CompetitionTeamMapper;
import com.lifeix.football.games.module.competition.mapper.MatchMapper;
import com.lifeix.football.games.module.competition.service.CompetitionService;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionMapper competitionMapper;

    @Autowired
    private CompetitionTeamMapper competitionTeamMapper;

    @Autowired
    private MatchMapper matchMapper;

    @Override
    public Competition findOne(Long competitionId) {
        Competition competition = competitionMapper.findOne(competitionId);
        // 参赛队伍
        List<CompetitionTeamInfo> teams = competitionTeamMapper.findByCompetitionId(competitionId);
        competition.setTeams(teams);
        // 赛事比赛
        List<MatchInfo> matches = matchMapper.findByCompetitionId(competitionId);
        competition.setMatches(matches);
        return competition;
    }

}
