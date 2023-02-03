package com.example.demo.Match;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.Team.Team;
import com.example.demo.TrongTai.TrongTai;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.Data;

@Entity
@Table(name="trandau")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TranDau {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name="team_id")
	private Team team1;
	
	@OneToOne
	@JoinColumn(name="team_id1")
	private Team team2;
	
	@Column
	private Date ngayThiDau;
	
	@Column
	private int tienDatcoc;
	
	@OneToOne
	@JoinColumn(name = "trongtai_id")
	private TrongTai trongTai;
	
	@Column
	private String thoiGianThiDau;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public Date getNgayThiDau() {
		return ngayThiDau;
	}

	public void setNgayThiDau(Date ngayThiDau) {
		this.ngayThiDau = ngayThiDau;
	}

	public int getTienDatcoc() {
		return tienDatcoc;
	}

	public void setTienDatcoc(int tienDatcoc) {
		this.tienDatcoc = tienDatcoc;
	}

	public String getThoiGianThiDau() {
		return thoiGianThiDau;
	}

	public void setThoiGianThiDau(String thoiGianThiDau) {
		this.thoiGianThiDau = thoiGianThiDau;
	}


	public TranDau(int id, Team team1, Team team2, Date ngayThiDau, int tienDatcoc, TrongTai trongTai,
			String thoiGianThiDau) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.ngayThiDau = ngayThiDau;
		this.tienDatcoc = tienDatcoc;
		this.trongTai = trongTai;
		this.thoiGianThiDau = thoiGianThiDau;
	}

	public TrongTai getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(TrongTai trongTai) {
		this.trongTai = trongTai;
	}

	public TranDau() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
