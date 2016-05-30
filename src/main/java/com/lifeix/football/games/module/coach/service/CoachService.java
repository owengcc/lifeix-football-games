package com.lifeix.football.games.module.coach.service;

import java.util.List;
import java.util.Map;

import com.lifeix.football.games.model.Coach;

public interface CoachService {

    public Coach findOne(Long id);

    public List<Coach> findCoachByLevel(String level, Long startId, Integer pageSize);

    /**
     * key:队伍名称 value:队伍中的教练
     * 
     * @param teamCategoryId
     * @return
     */
    public Map<String, List<Coach>> findCoachByTeamCategory(Long teamCategoryId);
}
