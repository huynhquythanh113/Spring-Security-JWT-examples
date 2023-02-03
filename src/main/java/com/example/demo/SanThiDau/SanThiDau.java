package com.example.demo.SanThiDau;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="SanThiDau")
public class SanThiDau {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String address;
	
	@Column
	private String soDienThoai;
	
	@Column
	private Boolean status;
	
	@Column
	private String avatar;
	
	@Column
	private int giaTien;
	
}
