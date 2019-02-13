package com.ozii.springbootapp.oziiService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ozii.springbootapp.oziiService.dao.PlayerRepository;
import com.ozii.springbootapp.oziiService.entity.Player;
import com.ozii.springbootapp.oziiService.service.PlayerService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private PlayerService thePlayerService;
	
	@GetMapping("/home")
	public String login(Model theModel) {
		
		List<Player> thePlayers = thePlayerService.findAll();
		System.out.println("SIZE:" + thePlayers.size());
		theModel.addAttribute("players", thePlayers);
		System.out.println("SCORE: " + thePlayers.get(1).getLastGameDate());
		
		return "/home-page";
	}
	
}
