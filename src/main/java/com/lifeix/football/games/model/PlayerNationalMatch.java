package com.lifeix.football.games.model;

public class PlayerNationalMatch {

    private Long id;

    private Long playerId;

    private CompetitionInfo competition;

    private TeamInfo hostTeam;

    private TeamInfo awayTeam;

    private Integer hostScore;

    private Integer awayScore;

    private Integer first;

    private Integer showTime;

    private Integer goal;

    private Integer booking;

    private Integer dismissal;

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

    public CompetitionInfo getCompetition() {
        return competition;
    }

    public void setCompetition(CompetitionInfo competition) {
        this.competition = competition;
    }

    public TeamInfo getHostTeam() {
        return hostTeam;
    }

    public void setHostTeam(TeamInfo hostTeam) {
        this.hostTeam = hostTeam;
    }

    public TeamInfo getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamInfo awayTeam) {
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

}
