package com.spring.player.player_statistics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerStatistics {

    private int numberTeams;
    private int numberPlayers;
    private String country;

}
