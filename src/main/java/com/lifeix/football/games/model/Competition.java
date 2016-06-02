package com.lifeix.football.games.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 赛事
 * 
 * @author gcc
 */
@JsonInclude(Include.NON_EMPTY)
public class Competition {

    private String id = null;

    /**
     * CompetitionCategory中的name是固定不变的 赛事名称,可能会因为赞助商等原因每个赛事改变
     */
    private String name = null;

    private Date startDate = null;

    private Date endDate = null;

    private CompetitionCategory competitionCategory = null;

    /**
     * 赛事参赛球队
     */
    private List<CompetitionTeamInfo> teams = new ArrayList<CompetitionTeamInfo>();

    private List<MatchInfo> matches = new ArrayList<MatchInfo>();

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public CompetitionCategory getCompetitionCategory() {
        return competitionCategory;
    }

    public void setCompetitionCategory(CompetitionCategory competitionCategory) {
        this.competitionCategory = competitionCategory;
    }

    public List<CompetitionTeamInfo> getTeams() {
        return teams;
    }

    public void setTeams(List<CompetitionTeamInfo> teams) {
        this.teams = teams;
    }

    public List<MatchInfo> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchInfo> matches) {
        this.matches = matches;
    }

}
