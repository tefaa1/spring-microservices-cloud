package com.spring.team.controller;

import com.spring.team.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team-players")
public class TeamController {

    @GetMapping("/team/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable  String from,@PathVariable String to){
        return Team.builder()
                .id(1L)
                .from(from)
                .to(to)
                .moneyTeam(100)
                .note("NONE")
                .numberTeam("50")
                .build();
    }
}
