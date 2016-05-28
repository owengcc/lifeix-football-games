package com.lifeix.football.games.module.competition.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.CompetitionCategory;
import com.lifeix.football.games.module.competition.mapper.CompetitionCategoryMapper;
import com.lifeix.football.games.module.competition.service.CompetitionCategoryService;

@Service
public class CompetitionCategoryServiceImpl implements CompetitionCategoryService {

    @Autowired
    private CompetitionCategoryMapper competitionCategoryMapper;

    @Override
    public CompetitionCategory findOne(Long competitionCategoryId) {
        return competitionCategoryMapper.findOne(competitionCategoryId);
    }

    @Override
    public List<CompetitionCategory> findAll() {
        return competitionCategoryMapper.findAll();
    }

}
