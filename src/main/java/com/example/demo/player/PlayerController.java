package com.example.demo.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.HLV.HLV;

@RequestMapping(path = "/api/player")
@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private PlayerRespon playerRespon;
	
	@GetMapping
	List<Player> getList(){
		return playerRespon.findAll();
	}
	@PostMapping
	String get() {
		HLV a = new HLV();
		
		return "";
	}
}
