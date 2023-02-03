package com.example.demo.HLV;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.Team.Team;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="HuanLuyenVien")
@NoArgsConstructor
@AllArgsConstructor
public class HLV {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String soDienThoai;
	
	@Column
	private int age;
	
	@Column
	private Date DOB;
	
	@OneToOne(mappedBy = "hlv")
	@JsonIgnore
	private Team team;
	
//	@OneToMa
//	private Collection<Team> teams;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public HLV(int id, String name, String soDienThoai, int age, Date dOB, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.soDienThoai = soDienThoai;
		this.age = age;
		DOB = dOB;
		this.team = team;
	}
	public HLV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
