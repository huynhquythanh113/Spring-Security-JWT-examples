package com.example.demo.Match;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/trandau")
public class TranDauController {
	
	@Autowired
	private TranDauService tranDauService;
	
	@GetMapping
	List<TranDau> getList(){
		return tranDauService.getList();
	}
}
