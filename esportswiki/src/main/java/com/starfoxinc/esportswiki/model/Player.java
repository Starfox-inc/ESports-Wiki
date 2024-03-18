package com.starfoxinc.esportswiki.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="player")
public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "teamName")
    private String teamName;
    @Column(name = "currentVideogame")
    private String currentVideogame;
    @Column(name = "playerName")
    private String playerName;
    @Column(name = "role")
    private String role;



    public Player(){
    
    }

    public Player(Long id, String firstName, String lastName, String teamName, String currentVideogame, String playerName, String role){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
        this.currentVideogame = currentVideogame;
        this.playerName = playerName;
        this.role = role;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getTeamName(){
        return teamName;
    }
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public String getCurrentVideoGame(){
        return currentVideogame;
    }
    public void setCurrentVideoGame(String currentVideogame){
        this.currentVideogame = currentVideogame;
    }

    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }


}