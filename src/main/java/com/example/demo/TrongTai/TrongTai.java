package com.example.demo.TrongTai;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.Match.TranDau;
import com.example.demo.player.Player;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table
public class TrongTai {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@Column
	private Date DOB;
	
	@Column
	private int chieuCao;
	
	@Column
	private int canNang;
	
//	@OneToOne(mappedBy = "trongTai")
//	@JsonIgnore
//	private TranDau tranDau;
}
