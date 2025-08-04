package com.spring.cloud.football.controller;

import com.spring.cloud.football.model.PlayerTeam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/football-players")
public class FootballController {

    @GetMapping("/buy/{from}/player/{to}")
    public PlayerTeam buyPlayer(@PathVariable String from, @PathVariable String to){
        return PlayerTeam.builder()
                .id(1L)
                .from(from)
                .to(to)
                .moneyPlayer(500)
                .moneyTeam(600)
                .build();
    }
}
