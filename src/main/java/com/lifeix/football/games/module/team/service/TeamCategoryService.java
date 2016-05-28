package com.lifeix.football.games.module.team.service;

import com.lifeix.football.games.model.TeamCategory;

public interface TeamCategoryService {

    public TeamCategory findOne(Long id);

    public TeamCategory findOneOnlyHaveLeaf(Long teamCategoryId);
}
