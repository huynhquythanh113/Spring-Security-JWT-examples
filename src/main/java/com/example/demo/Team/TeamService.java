package com.example.demo.Team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

	@Autowired
	private TeamRespon teamRespon;
	
	List<Team> getList(){
		return teamRespon.findAll();
	}
}
