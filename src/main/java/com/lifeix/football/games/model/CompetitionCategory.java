package com.lifeix.football.games.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class CompetitionCategory {
    private Long id = null;

    private String name = null;

    /**
     * 赛事标志
     */
    private String flag = null;

    /**
     * 赛事规则
     */
    private String rule = null;

    /**
     * 赛事比赛形式分类 类别 0：联赛 1：分小组双循环比赛 2：小组赛+主客场淘汰赛 3：小组赛+单场淘汰赛 4：小组赛+单场淘汰赛+主客场淘汰赛 5：其他
     */
    private Integer scheduleType = null;

    /**
     * 赛事按参赛队分类 类别 0：国家队 类别 1：职业俱乐部 类别 2：业余俱乐部 4：校园足球队 5：其他
     */
    private Integer teamType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Integer getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
    }

    public Integer getTeamType() {
        return teamType;
    }

    public void setTeamType(Integer teamType) {
        this.teamType = teamType;
    }

}
