package com.spring.cloud.football.repository;

import com.spring.cloud.football.model.PlayerTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<PlayerTeam,Long> {

    PlayerTeam getByFromAndTo(String from,String to);
}
