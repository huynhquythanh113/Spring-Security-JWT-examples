package com.example.demo.Team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/team")
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@GetMapping
	List<Team> getList(){
		return teamService.getList();
	}
}
