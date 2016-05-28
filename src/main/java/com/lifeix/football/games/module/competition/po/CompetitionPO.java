package com.lifeix.football.games.module.competition.po;

import java.util.Date;

/**
 * 赛事
 * 
 * @author gcc
 */
public class CompetitionPO {

    private String id = null;

    /**
     * CompetitionCategory中的name是固定不变的 赛事名称,可能会因为赞助商等原因每个赛事改变
     */
    private String name = null;

    private Date startTime = null;

    private Date endTime = null;

    private Long competitionCategoryId = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getCompetitionCategoryId() {
        return competitionCategoryId;
    }

    public void setCompetitionCategoryId(Long competitionCategoryId) {
        this.competitionCategoryId = competitionCategoryId;
    }

}
