package com.example.demo.HLV;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/api/huanluyenvien")
@RestController
public class HLVController {

	@Autowired
	private HLVService hlvService;
	
	@GetMapping
	List<HLV> getList(){
		return hlvService.getList();
	}
}
