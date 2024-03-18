package com.starfoxinc.esportswiki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starfoxinc.esportswiki.model.Player;
import com.starfoxinc.esportswiki.service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController{
    
    PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) { this.playerService = playerService;}

    @GetMapping()
    public Iterable<Player> getPlayers(){
        return playerService.getAllPlayers();
    }
    
}