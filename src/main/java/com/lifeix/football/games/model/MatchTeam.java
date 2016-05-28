package com.lifeix.football.games.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatchTeam {

    private Long id;

    private String name;

    private String introduce;

    private Date setupDate;

    private CompetitionInfo competitionInfo;

    private TeamInfo teamInfo;

    private CompetitionTeamInfo competitionTeamInfo;

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
    private List<PlayerInfo> firstPlayers = new ArrayList<PlayerInfo>();

    private List<PlayerInfo> substitutionPlayers = new ArrayList<PlayerInfo>();

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

    public CompetitionTeamInfo getCompetitionTeamInfo() {
        return competitionTeamInfo;
    }

    public void setCompetitionTeamInfo(CompetitionTeamInfo competitionTeamInfo) {
        this.competitionTeamInfo = competitionTeamInfo;
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

    public List<PlayerInfo> getFirstPlayers() {
        return firstPlayers;
    }

    public void setFirstPlayers(List<PlayerInfo> firstPlayers) {
        this.firstPlayers = firstPlayers;
    }

    public List<PlayerInfo> getSubstitutionPlayers() {
        return substitutionPlayers;
    }

    public void setSubstitutionPlayers(List<PlayerInfo> substitutionPlayers) {
        this.substitutionPlayers = substitutionPlayers;
    }

}
