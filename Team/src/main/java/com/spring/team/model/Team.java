package com.spring.team.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Team {

    private Long id;
    private String from;
    private String to;
    private int moneyTeam;
    private String note;
    private String numberTeam;
}
