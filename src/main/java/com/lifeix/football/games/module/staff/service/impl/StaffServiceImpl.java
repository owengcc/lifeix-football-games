package com.lifeix.football.games.module.staff.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.common.exception.IllegalparamException;
import com.lifeix.football.common.util.AdapterUtil;
import com.lifeix.football.games.model.Staff;
import com.lifeix.football.games.model.TeamInfo;
import com.lifeix.football.games.module.staff.mapper.StaffMapper;
import com.lifeix.football.games.module.staff.po.StaffPO;
import com.lifeix.football.games.module.staff.service.StaffService;
import com.lifeix.football.games.module.team.mapper.TeamMapper;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private TeamMapper teamMappper;

    @Override
    public Staff findOne(Long staffId) {
        if (staffId == null) {
            throw new IllegalparamException("staffId can not be null");
        }
        StaffPO po = staffMapper.findOne(staffId);
        Staff staff = AdapterUtil.toT(po, Staff.class);
        // 所属球队信息
        List<TeamInfo> teams = teamMappper.findTeamsByStaffId(staffId);
        if (teams != null && teams.size() > 0) {
            TeamInfo teamInfo = teams.get(0);
            staff.setTeam(teamInfo);
        }
        return staff;
    }

}
