package com.lifeix.football.games.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class MatchTeamJerseys {

    private Long matchTeamId;

    private String jacket;

    private String shorts;

    private String socks;

    private String image;

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

    public Long getMatchTeamId() {
        return matchTeamId;
    }

    public void setMatchTeamId(Long matchTeamId) {
        this.matchTeamId = matchTeamId;
    }

}
