package com.lifeix.football.games.model;

public class TeamInfo {
    private Long id = null;

    private String name = null;

    private String flag = null;

    private String position = null;

    private TeamCategory teamCategory;

    private Jerseys jerseys;

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public TeamCategory getTeamCategory() {
        return teamCategory;
    }

    public void setTeamCategory(TeamCategory teamCategory) {
        this.teamCategory = teamCategory;
    }

    public Jerseys getJerseys() {
        return jerseys;
    }

    public void setJerseys(Jerseys jerseys) {
        this.jerseys = jerseys;
    }

}
