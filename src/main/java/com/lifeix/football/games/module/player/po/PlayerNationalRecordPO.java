package com.lifeix.football.games.module.player.po;

public class PlayerNationalRecordPO {

    private Long id;

    private Long playerId;

    /**
     * 出场次数
     */
    private Integer gamesplayed = null;

    /**
     * 上场次数
     */
    private Integer starts = null;

    /**
     * 替补上场次数
     */
    private Integer substitution = null;

    /**
     * 进球数
     */
    private Integer goals = null;

    /**
     * 黄牌数
     */
    private Integer bookings = null;

    /**
     * 红牌数
     */

    private Integer dismissals = null;

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

    public Integer getGamesplayed() {
        return gamesplayed;
    }

    public void setGamesplayed(Integer gamesplayed) {
        this.gamesplayed = gamesplayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Integer getSubstitution() {
        return substitution;
    }

    public void setSubstitution(Integer substitution) {
        this.substitution = substitution;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getBookings() {
        return bookings;
    }

    public void setBookings(Integer bookings) {
        this.bookings = bookings;
    }

    public Integer getDismissals() {
        return dismissals;
    }

    public void setDismissals(Integer dismissals) {
        this.dismissals = dismissals;
    }

}
