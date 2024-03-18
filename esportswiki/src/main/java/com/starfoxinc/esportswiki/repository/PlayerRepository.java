package com.starfoxinc.esportswiki.repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.starfoxinc.esportswiki.model.Player;

@ComponentScan(basePackages = "com.starfox.esportswiki.model.Player")
@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}