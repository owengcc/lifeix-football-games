package com.lifeix.football.games.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 赛事参赛队伍
 * 
 * @author gcc
 */
public class CompetitionTeam {

    private Long id;

    private String name;

    private String introduce;

    private Date setupDate;

    private CompetitionInfo competitionInfo;

    private TeamInfo teamInfo;

    /**
     * 主教练
     */
    private Coach chiefCoach = null;

    /**
     * 助理教练
     */
    private Coach assistantCoach = null;

    /**
     * 门将教练
     */
    private Coach gkCoach = null;

    /**
     * 体能教练
     */
    private Coach physicalCoach = null;

    /**
     * 领队
     */
    private Staff teamLeader;

    /**
     * 队医
     */
    private Staff doctor;

    /**
     * 球员信息
     */
    private List<PlayerInfo> players = new ArrayList<PlayerInfo>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompetitionInfo getCompetitionInfo() {
        return competitionInfo;
    }

    public void setCompetitionInfo(CompetitionInfo competitionInfo) {
        this.competitionInfo = competitionInfo;
    }

    public TeamInfo getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(TeamInfo teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Date getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(Date setupDate) {
        this.setupDate = setupDate;
    }

    public Coach getChiefCoach() {
        return chiefCoach;
    }

    public void setChiefCoach(Coach chiefCoach) {
        this.chiefCoach = chiefCoach;
    }

    public Coach getAssistantCoach() {
        return assistantCoach;
    }

    public void setAssistantCoach(Coach assistantCoach) {
        this.assistantCoach = assistantCoach;
    }

    public Coach getGkCoach() {
        return gkCoach;
    }

    public void setGkCoach(Coach gkCoach) {
        this.gkCoach = gkCoach;
    }

    public Coach getPhysicalCoach() {
        return physicalCoach;
    }

    public void setPhysicalCoach(Coach physicalCoach) {
        this.physicalCoach = physicalCoach;
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

    public List<PlayerInfo> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerInfo> players) {
        this.players = players;
    }

}
