package com.spring.cloud.football.controller;

import com.spring.cloud.football.model.PlayerTeam;
import com.spring.cloud.football.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/football-players")
public class FootballController {

    PlayersRepository playersRepository;

    @Autowired
    public FootballController(PlayersRepository playersRepository){
        this.playersRepository = playersRepository;
    }
    @GetMapping("/buy/{from}/player/{to}")
    public PlayerTeam buyPlayer(@PathVariable String from, @PathVariable String to) {
        return playersRepository.getByFromAndTo(from, to);
    }
}
