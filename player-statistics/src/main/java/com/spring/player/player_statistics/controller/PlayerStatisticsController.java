package com.spring.player.player_statistics.controller;

import com.spring.player.player_statistics.config.PlayerStatisticsConfig;
import com.spring.player.player_statistics.model.PlayerStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players-management")
public class PlayerStatisticsController {

    @Autowired
    private PlayerStatisticsConfig playerStatisticsConfig;

    @GetMapping("/statistics")
    public PlayerStatistics getPlayerStatistics(){
        return new PlayerStatistics(playerStatisticsConfig.getNumberTeams(),
                                    playerStatisticsConfig.getNumberPlayers(),
                                    playerStatisticsConfig.getCountry());
    }
}
