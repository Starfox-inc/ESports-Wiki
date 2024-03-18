package com.starfoxinc.esportswiki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starfoxinc.esportswiki.model.Player;
import com.starfoxinc.esportswiki.repository.PlayerRepository;




@Service
public class PlayerService{

    PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;}


    public Iterable<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
    
}