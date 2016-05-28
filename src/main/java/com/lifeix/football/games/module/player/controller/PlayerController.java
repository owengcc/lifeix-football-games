package com.lifeix.football.games.module.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.model.Player;
import com.lifeix.football.games.module.player.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/{playerId}", method = RequestMethod.GET)
    public Player findOne(@PathVariable(value = "playerId") Long playerId) {
        return playerService.findOne(playerId);
    }

}
