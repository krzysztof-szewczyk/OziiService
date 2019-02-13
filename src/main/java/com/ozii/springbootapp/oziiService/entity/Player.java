package com.ozii.springbootapp.oziiService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="nick")
	private String nick;
	
	@Column(name="last_game_date")
	private String lastGameDate;
	
	@Column(name="score")
	private int score;
}
