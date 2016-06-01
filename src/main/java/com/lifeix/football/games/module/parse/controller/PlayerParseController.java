package com.lifeix.football.games.module.parse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifeix.football.games.module.parse.service.PlayerParseService;

@RestController
@RequestMapping("/parse/player")
public class PlayerParseController {
    @Autowired
    private PlayerParseService service;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public void insert() throws Exception {
        service.insetPlayers();
    }
}