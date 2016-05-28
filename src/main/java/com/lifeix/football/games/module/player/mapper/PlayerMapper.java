package com.lifeix.football.games.module.player.mapper;

import java.util.List;

import com.lifeix.football.games.model.Player;
import com.lifeix.football.games.model.PlayerInfo;

public interface PlayerMapper {

    public Player findOne(Long id);

    public List<PlayerInfo> findPlayerByCompetitionTeamId(Long competitionTeamId);

    public List<PlayerInfo> findPlayerByMatchTeamId(Long matchTeamId);

}
