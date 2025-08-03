package com.spring.player.player_statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class PlayerStatisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerStatisticsApplication.class, args);
	}

}
