package com.ozii.springbootapp.oziiService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ozii.springbootapp.oziiService.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
	public List<Player> findAllByOrderByScoreDesc();
}
