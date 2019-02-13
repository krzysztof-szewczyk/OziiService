package com.ozii.springbootapp.oziiService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ozii.springbootapp.oziiService.dao.PlayerRepository;
import com.ozii.springbootapp.oziiService.entity.Player;

@Service
public class PlayerServiceImpl implements PlayerService {
	
	@Autowired
	private PlayerRepository thePlayerRepository;
	
	public List<Player> findAll(){
		List<Player> thePlayers = thePlayerRepository.findAllByOrderByScoreDesc();
		
		return thePlayers;
	};
}
