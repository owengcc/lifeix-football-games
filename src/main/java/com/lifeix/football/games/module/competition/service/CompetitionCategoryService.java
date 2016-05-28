package com.lifeix.football.games.module.competition.service;

import java.util.List;

import com.lifeix.football.games.model.CompetitionCategory;

public interface CompetitionCategoryService {

    public CompetitionCategory findOne(Long competitionCategoryId);

    public List<CompetitionCategory> findAll();
}
