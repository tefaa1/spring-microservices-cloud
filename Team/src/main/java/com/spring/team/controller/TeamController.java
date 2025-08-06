package com.spring.team.controller;

import com.spring.team.config.ApiCall;
import com.spring.team.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/team-players")
public class TeamController {

    ApiCall apiCall;

    @Autowired
    public TeamController(ApiCall apiCall){
        this.apiCall = apiCall;
    }

    @GetMapping("/teamNew/{from}/player/{to}")
    public Team teamWithPlayer(@PathVariable  String from,@PathVariable String to){
        Map<String,String>urlAttribute = new HashMap<>();
        urlAttribute.put("from",from);
        urlAttribute.put("to",to);
        ResponseEntity<Team> teamResponseEntity =   new RestTemplate().getForEntity(
                "http://localhost:8888/football-players/buy/{from}/player/{to}",
                Team.class,
                urlAttribute
        );
        Team team = teamResponseEntity.getBody();
        return Team.builder()
                .id(team.getId())
                .from(team.getFrom())
                .to(team.getTo())
                .moneyTeam(team.getMoneyTeam())
                .note("NONE")
                .numberTeam("50")
                .build();
    }

    @GetMapping("/team/{from}/player/{to}")
    public Team teamWithPlayerNew(@PathVariable  String from,@PathVariable String to){

        Team team = apiCall.getFootballPlayer(from, to);
        team.setNumberTeam("50");
        team.setNote("NONE");
        return team;
    }
}
