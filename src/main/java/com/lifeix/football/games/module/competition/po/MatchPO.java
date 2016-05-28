package com.lifeix.football.games.module.competition.po;

import java.util.Date;

/**
 * @author gcc
 */
public class MatchPO {

    private String id = null;

    private Long hostTeam = null;

    private String position = null;

    private Integer hostScore = 0;

    private Long awayTeam = null;

    private Integer awayScore = 0;

    private Long competitionid = null;

    private Date startTime = null;

    private Long courtId = null;

    /**
     * 0:未开始 1：已结束
     */
    private Integer state = null;

    private String introduce = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getHostTeam() {
        return hostTeam;
    }

    public void setHostTeam(Long hostTeam) {
        this.hostTeam = hostTeam;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getHostScore() {
        return hostScore;
    }

    public void setHostScore(Integer hostScore) {
        this.hostScore = hostScore;
    }

    public Long getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Long awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public Long getCompetitionid() {
        return competitionid;
    }

    public void setCompetitionid(Long competitionid) {
        this.competitionid = competitionid;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Long getCourtId() {
        return courtId;
    }

    public void setCourtId(Long courtId) {
        this.courtId = courtId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

}
