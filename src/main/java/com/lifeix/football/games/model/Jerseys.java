package com.lifeix.football.games.model;

import java.util.Date;

public class Jerseys {

    private Long id;

    private Long teamId;

    private String jacket;

    private String shorts;

    private String socks;

    private String image;

    private Date startDate;

    private Date endDate;

    private String introduce;

    public String getJacket() {
        return jacket;
    }

    public void setJacket(String jacket) {
        this.jacket = jacket;
    }

    public String getShorts() {
        return shorts;
    }

    public void setShorts(String shorts) {
        this.shorts = shorts;
    }

    public String getSocks() {
        return socks;
    }

    public void setSocks(String socks) {
        this.socks = socks;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

}
