package com.lifeix.football.games.module.player.mapper;

import java.util.List;

import com.lifeix.football.games.model.PlayerNationalMatch;
import com.lifeix.football.games.module.player.po.PlayerNationalMatchPO;

public interface PlayerNationalMatchMapper {

    public List<PlayerNationalMatch> findNationMathesByPlayerId(Long playerId);

    public void insertOne(PlayerNationalMatchPO po);
}
