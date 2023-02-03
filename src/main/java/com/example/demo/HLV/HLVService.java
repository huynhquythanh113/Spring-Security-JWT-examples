package com.example.demo.HLV;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HLVService {

	@Autowired
	private HLVRespon hlvRespon;
	
	List<HLV> getList(){
		return hlvRespon.findAll();
	}
}
