package com.spring.cloud.football.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerTeam {

    private Long id;
    private String from;
    private String to;
    private int moneyPlayer;
    private int moneyTeam;
}
