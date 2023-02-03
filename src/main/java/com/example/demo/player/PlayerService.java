package com.example.demo.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	@Autowired
	private PlayerRespon playerRespon;
	
	public List<Player> getList(){
		return playerRespon.findAll();
	}
}
