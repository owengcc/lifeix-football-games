package com.lifeix.football.games.module.competition.mapper;

import java.util.List;

import com.lifeix.football.games.model.CompetitionCategory;

public interface CompetitionCategoryMapper {

    public CompetitionCategory findOne(Long id);

    public List<CompetitionCategory> findAll();
}
