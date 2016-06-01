package com.lifeix.football.games.module.player.po;

import java.util.Date;

public class PlayerNationalMatchPO {

    private Long id;

    private Long playerId;

    private Long competitionId;

    private String hostTeam;

    private String awayTeam;

    private Integer hostScore;

    private Integer awayScore;

    private Integer first;

    private Integer showTime;

    private Integer goal;

    private Integer assists;

    private Integer booking;

    private Integer dismissal;

    private Date matchDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Long getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Long competitionId) {
        this.competitionId = competitionId;
    }

    public String getHostTeam() {
        return hostTeam;
    }

    public void setHostTeam(String hostTeam) {
        this.hostTeam = hostTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getHostScore() {
        return hostScore;
    }

    public void setHostScore(Integer hostScore) {
        this.hostScore = hostScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getShowTime() {
        return showTime;
    }

    public void setShowTime(Integer showTime) {
        this.showTime = showTime;
    }

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    public Integer getBooking() {
        return booking;
    }

    public void setBooking(Integer booking) {
        this.booking = booking;
    }

    public Integer getDismissal() {
        return dismissal;
    }

    public void setDismissal(Integer dismissal) {
        this.dismissal = dismissal;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

}
