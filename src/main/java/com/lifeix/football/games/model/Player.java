package com.lifeix.football.games.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 球员详情显示的信息
 * 
 * @author gcc
 */
@JsonInclude(Include.NON_EMPTY)
public class Player {

    private String id = null;

    private String name = null;

    private String avatar = null;

    private Integer height = null;

    private Integer weight = null;

    private String country = null;

    private Date birthday = null;

    private String birthplace = null;

    /**
     * 国家队比赛数据统计
     */
    private PlayerNationalRecord record;

    /**
     * 所属国家队
     */
    private TeamInfo nationTeam = null;

    /**
     * 所属俱乐部
     */
    private TeamInfo club = null;

    /**
     * 俱乐部生涯
     */
    private List<TeamInfo> career = new ArrayList<TeamInfo>();

    /**
     * 参加过的国家队比赛
     */
    private List<PlayerNationalMatch> matches = new ArrayList<PlayerNationalMatch>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public TeamInfo getNationTeam() {
        return nationTeam;
    }

    public void setNationTeam(TeamInfo nationTeam) {
        this.nationTeam = nationTeam;
    }

    public TeamInfo getClub() {
        return club;
    }

    public void setClub(TeamInfo club) {
        this.club = club;
    }

    public List<TeamInfo> getCareer() {
        return career;
    }

    public void setCareer(List<TeamInfo> career) {
        this.career = career;
    }

    public List<PlayerNationalMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<PlayerNationalMatch> matches) {
        this.matches = matches;
    }

    public PlayerNationalRecord getRecord() {
        return record;
    }

    public void setRecord(PlayerNationalRecord record) {
        this.record = record;
    }

}
