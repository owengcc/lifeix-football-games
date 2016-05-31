package com.lifeix.football.games.module.staff.mapper;

import java.util.List;

import com.lifeix.football.games.model.MatchStaff;

public interface MatchStaffMapper {

    public List<MatchStaff> findByMatchId(Long matchId);
}
