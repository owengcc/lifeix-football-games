package com.lifeix.football.games.module.competition.mapper;

import com.lifeix.football.games.model.Competition;
import com.lifeix.football.games.model.CompetitionInfo;

public interface CompetitionMapper {

    public Competition findOne(Long id);

    public CompetitionInfo findSimpleOne(Long competitionId);

}
