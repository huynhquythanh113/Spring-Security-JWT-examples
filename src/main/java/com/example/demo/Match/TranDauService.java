package com.example.demo.Match;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranDauService {

	@Autowired
	private TranDauRespon tranDauRespon;
	
	List<TranDau> getList(){
		return tranDauRespon.findAll();
	}
}
