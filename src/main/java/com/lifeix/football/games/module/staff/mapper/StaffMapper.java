package com.lifeix.football.games.module.staff.mapper;

import java.util.List;

import com.lifeix.football.games.model.Staff;
import com.lifeix.football.games.module.staff.po.StaffPO;

public interface StaffMapper {

    public StaffPO findOne(Long id);

    public List<Staff> findStaffByCompetitionTeamId(Long competitionTeamId);

    public List<Staff> findStaffByMatchTeamId(Long matchTeamId);
}
