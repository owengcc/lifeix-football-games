package com.lifeix.football.games.module.competition.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.Match;
import com.lifeix.football.games.model.MatchInfo;
import com.lifeix.football.games.module.competition.mapper.MatchMapper;
import com.lifeix.football.games.module.competition.mapper.MatchTeamMapper;
import com.lifeix.football.games.module.competition.service.MatchService;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchMapper matchMapper;

    @Autowired
    private MatchTeamMapper matchTeamMapper;

    @Override
    public Match finfOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MatchInfo> findByCompetitionId(Long competitionId, Long teamId) {
        List<Long> matchTeamIds = new ArrayList<Long>();
        matchTeamIds = matchTeamMapper.findMatchTeamIdsByTeamId(teamId);
        List<MatchInfo> lists = matchMapper.findByCompetitionIdAndMatchTeamIds(competitionId, matchTeamIds);
        return lists;
    }

}
