package com.lifeix.football.games.module.player.mapper;

import java.util.List;

import com.lifeix.football.games.model.Player;
import com.lifeix.football.games.model.PlayerInfo;
import com.lifeix.football.games.module.player.po.PlayerPO;

public interface PlayerMapper {

    public void insertOne(PlayerPO po);

    public Player findOne(Long id);

    public List<PlayerInfo> findPlayerByCompetitionTeamId(Long competitionTeamId);

    public List<PlayerInfo> findPlayerByMatchTeamId(Long matchTeamId);

}
