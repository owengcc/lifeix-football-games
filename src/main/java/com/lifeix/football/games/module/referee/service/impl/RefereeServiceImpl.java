package com.lifeix.football.games.module.referee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.common.exception.IllegalparamException;
import com.lifeix.football.common.util.AdapterUtil;
import com.lifeix.football.games.model.Referee;
import com.lifeix.football.games.module.referee.mapper.RefereeMapper;
import com.lifeix.football.games.module.referee.po.RefereePO;
import com.lifeix.football.games.module.referee.service.RefereeService;

@Service
public class RefereeServiceImpl implements RefereeService {
    @Autowired
    private RefereeMapper refereeMapper;

    @Override
    public Referee findOne(Long refereeId) {
        if (refereeId == null) {
            throw new IllegalparamException("refereeId can not be null");
        }
        RefereePO po = refereeMapper.findOne(refereeId);
        Referee referee = AdapterUtil.toT(po, Referee.class);
        return referee;
    }

    @Override
    public List<Referee> list(String level, Long startId, Integer pageSize) {

        return refereeMapper.list(level, startId, pageSize);
    }

}
