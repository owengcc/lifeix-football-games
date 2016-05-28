package com.lifeix.football.games.module.team.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.games.model.TeamCategory;
import com.lifeix.football.games.module.team.mapper.TeamCategoryMapper;
import com.lifeix.football.games.module.team.service.TeamCategoryService;

@Service
public class TeamCategoryServiceImpl implements TeamCategoryService {
    @Autowired
    private TeamCategoryMapper teamCategoryMapper;

    @Override
    public TeamCategory findOne(Long id) {
        return teamCategoryMapper.findOne(id);
    }

    @Override
    public TeamCategory findOneOnlyHaveLeaf(Long teamCategoryId) {
        List<TeamCategory> list = teamCategoryMapper.findOnlyLeafChildren(teamCategoryId);
        if (list.size() > 0) {
            TeamCategory teamCategory = list.get(0);
            teamCategory.setCategories(list.subList(1, list.size()));
            return teamCategory;
        }
        return null;
    }

}
