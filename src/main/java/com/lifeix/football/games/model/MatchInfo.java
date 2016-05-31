package com.lifeix.football.games.model;

import java.util.Date;

public class MatchInfo {

    private String id = null;

    private MatchTeamInfo hostTeam = null;

    private Integer hostScore = 0;

    private MatchTeamInfo awayTeam = null;

    private Integer awayScore = 0;

    private Date startDate = null;

    private Date startTime = null;

    private String position = null;

    private Integer state = null;

    private String stage = null;

    private String group = null;

    private CompetitionInfo competitionInfo = null;

    private Court court = null;

    private String introduce = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MatchTeamInfo getHostTeam() {
        return hostTeam;
    }

    public void setHostTeam(MatchTeamInfo hostTeam) {
        this.hostTeam = hostTeam;
    }

    public Integer getHostScore() {
        return hostScore;
    }

    public void setHostScore(Integer hostScore) {
        this.hostScore = hostScore;
    }

    public MatchTeamInfo getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(MatchTeamInfo awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public CompetitionInfo getCompetitionInfo() {
        return competitionInfo;
    }

    public void setCompetitionInfo(CompetitionInfo competitionInfo) {
        this.competitionInfo = competitionInfo;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

}
