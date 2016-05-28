package com.lifeix.football.games.module.coach.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.common.exception.IllegalparamException;
import com.lifeix.football.games.model.Coach;
import com.lifeix.football.games.model.TeamCategory;
import com.lifeix.football.games.model.TeamInfo;
import com.lifeix.football.games.module.coach.mapper.CoachMapper;
import com.lifeix.football.games.module.coach.service.CoachService;
import com.lifeix.football.games.module.team.mapper.TeamCategoryMapper;
import com.lifeix.football.games.module.team.mapper.TeamMapper;

@Service
public class CoachServiceImpl implements CoachService {

    @Autowired
    private CoachMapper coachMapper;

    @Autowired
    private TeamMapper teamMappper;

    @Autowired
    private TeamCategoryMapper teamCategoryMapper;

    @Override
    public Coach findOne(Long id) {
        if (id == null) {
            throw new IllegalparamException("coachId can not be null");
        }
        // 第一部分
        Coach coach = coachMapper.findOne(id);
        // 第二部分，当前归属球队和职业生涯
        List<TeamInfo> career = teamMappper.findTeamsByCoachId(id);
        if (career != null && career.size() > 0) {
            coach.setTeam(career.get(0));
            coach.setCareer(career);
        }
        return coach;
    }

    @Override
    public List<Coach> findCoachByLevel(String level, Long startId, Integer pageSize) {
        List<Coach> list = coachMapper.findCoachByLevel(level, startId, pageSize);
        return list;
    }

    @Override
    public Map<String, List<Coach>> findCoachByTeamCategory(Long teamCategoryId) {
        Map<String, List<Coach>> map = new HashMap<String, List<Coach>>();

        // 球队分类下的最小单位
        List<TeamCategory> list = teamCategoryMapper.findOnlyLeafChildren(teamCategoryId);
        for (TeamCategory category : list) {
            Long categoryId = category.getId();
            TeamInfo teamInfo = teamMappper.findTeamsByCategoryId(categoryId).get(0);
            if (teamInfo == null) {
                continue;
            }
            List<Coach> coches = coachMapper.findCoachByTeamId(teamInfo.getId());
            map.put(teamInfo.getName(), coches);
        }
        return map;
    }

}
