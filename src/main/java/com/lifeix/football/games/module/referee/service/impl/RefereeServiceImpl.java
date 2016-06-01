package com.lifeix.football.games.module.referee.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeix.football.common.exception.IllegalparamException;
import com.lifeix.football.games.model.Referee;
import com.lifeix.football.games.module.referee.mapper.RefereeMapper;
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
        return refereeMapper.findOne(refereeId);
    }

    @Override
    public Map<String, List<Referee>> getReferees(String level, Long startId, Integer pageSize) {
        Map<String, List<Referee>> map = new HashMap<String, List<Referee>>();
        List<Referee> elevenMan = new ArrayList<Referee>();
        List<Referee> elevenManAssistant = new ArrayList<Referee>();
        List<Referee> elevenWoman = new ArrayList<Referee>();
        List<Referee> elevenWomanAssistant = new ArrayList<Referee>();
        List<Referee> fiveMan = new ArrayList<Referee>();
        List<Referee> fiveWoman = new ArrayList<Referee>();
        List<Referee> beach = new ArrayList<Referee>();
        List<Referee> list = refereeMapper.list(level, startId, pageSize);
        for (Referee referee : list) {
            String category = referee.getCategory();
            String sex = referee.getSex();
            String function = referee.getFunction();
            if ("11人制".equals(category)) {
                if ("男".equals(sex)) {
                    if ("主裁".equals(function)) {
                        elevenMan.add(referee);
                    } else {
                        elevenManAssistant.add(referee);
                    }
                }
                if ("女".equals(sex)) {
                    if ("主裁".equals(function)) {
                        elevenWoman.add(referee);
                    } else {
                        elevenWomanAssistant.add(referee);
                    }
                }

            }

            if ("5人制".equals(category)) {
                if ("男".equals(sex)) {
                    fiveMan.add(referee);
                }
                if ("女".equals(sex)) {
                    fiveWoman.add(referee);
                }
            }

            if ("沙滩".equals(category)) {
                beach.add(referee);
            }

        }
        map.put("11人制足球-主裁-男", elevenMan);
        map.put("11人制足球-助理裁判-男", elevenManAssistant);
        map.put("11人制足球-主裁-女", elevenWoman);
        map.put("11人制足球-助理裁判-女", elevenWomanAssistant);
        map.put("5人制足球-男", fiveMan);
        map.put("5人制足球-女", fiveWoman);
        map.put("沙滩足球", beach);
        return map;
    }

    @Override
    public List<Referee> findByMathchId(Long matchId) {
        return refereeMapper.findByMathchId(matchId);
    }

}
