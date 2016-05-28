package com.lifeix.football.games.module.team.mapper;

import java.util.List;

import com.lifeix.football.games.model.TeamCategory;

public interface TeamCategoryMapper {

    public TeamCategory findOne(Long id);

    public List<TeamCategory> findChildren(Long id);

    public List<TeamCategory> findOnlyLeafChildren(Long id);

    public List<TeamCategory> findOnlyLeaf(Long id);

}
