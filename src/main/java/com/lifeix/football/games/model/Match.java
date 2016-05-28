package com.lifeix.football.games.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author gcc
 */
public class Match {

    private String id = null;

    private MatchTeam hostTeam = null;

    private Integer hostScore = 0;

    private MatchTeam awayTeam = null;

    private Integer awayScore = 0;

    private Date startTime = null;

    private String position = null;

    private CompetitionInfo competion = null;

    private Referee chiefReferee = null;

    private List<Referee> sideReferees = new ArrayList<Referee>();

    private Referee fourthReferee = null;

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

    public MatchTeam getHostTeam() {
        return hostTeam;
    }

    public void setHostTeam(MatchTeam hostTeam) {
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

    public MatchTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(MatchTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public CompetitionInfo getCompetion() {
        return competion;
    }

    public void setCompetion(CompetitionInfo competion) {
        this.competion = competion;
    }

    public Referee getChiefReferee() {
        return chiefReferee;
    }

    public void setChiefReferee(Referee chiefReferee) {
        this.chiefReferee = chiefReferee;
    }

    public List<Referee> getSideReferees() {
        return sideReferees;
    }

    public void setSideReferees(List<Referee> sideReferees) {
        this.sideReferees = sideReferees;
    }

    public Referee getFourthReferee() {
        return fourthReferee;
    }

    public void setFourthReferee(Referee fourthReferee) {
        this.fourthReferee = fourthReferee;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
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
