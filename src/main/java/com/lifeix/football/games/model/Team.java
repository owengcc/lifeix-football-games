package com.lifeix.football.games.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 球队
 * 
 * @author gcc
 */
public class Team {
    private Long id = null;

    private String name = null;

    private String flag = null;

    /**
     * 主教练
     */
    private Coach chiefCoach = null;

    /**
     * 助理教练
     */
    private List<Coach> assistantCoach = new ArrayList<Coach>();

    /**
     * 领队
     */
    private Staff teamLeader;

    /**
     * 队医
     */
    private Staff doctor;

    /**
     * 球队成员
     */
    private List<Player> players = new ArrayList<Player>();

    /**
     * 球队分类
     */
    private TeamCategory teamCategory;

    private Jerseys jerseys;

    public Coach getChiefCoach() {
        return chiefCoach;
    }

    public void setChiefCoach(Coach chiefCoach) {
        this.chiefCoach = chiefCoach;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Coach> getAssistantCoach() {
        return assistantCoach;
    }

    public void setAssistantCoach(List<Coach> assistantCoach) {
        this.assistantCoach = assistantCoach;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Staff getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Staff teamLeader) {
        this.teamLeader = teamLeader;
    }

    public Staff getDoctor() {
        return doctor;
    }

    public void setDoctor(Staff doctor) {
        this.doctor = doctor;
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
