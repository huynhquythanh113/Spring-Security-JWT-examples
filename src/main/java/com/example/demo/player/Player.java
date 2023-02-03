package com.example.demo.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.Team.Team;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PC
 *
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column
	private int SoAo;
	
	@Column
	private int SoBanThang;
	
	@Column
	private int ChiSoSut;
	
	@Column
	private int ChiSoChuyen;
	
	@Column
	private int ChiSoKyThuat;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="team_id")
	private Team team;
	
	@Column
	private int SoDienThoai;
	
	@Column
	private String userName;
	
	@Column
	private String passWord;
	
	@Column
	private int chieuCao;
	
	@Column
	private int canNang;
	
	@Column
	private String avartar;

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

	public int getSoAo() {
		return SoAo;
	}

	public void setSoAo(int soAo) {
		SoAo = soAo;
	}

	public int getSoBanThang() {
		return SoBanThang;
	}

	public void setSoBanThang(int soBanThang) {
		SoBanThang = soBanThang;
	}

	public int getChiSoSut() {
		return ChiSoSut;
	}

	public void setChiSoSut(int chiSoSut) {
		ChiSoSut = chiSoSut;
	}

	public int getChiSoChuyen() {
		return ChiSoChuyen;
	}

	public void setChiSoChuyen(int chiSoChuyen) {
		ChiSoChuyen = chiSoChuyen;
	}

	public int getChiSoKyThuat() {
		return ChiSoKyThuat;
	}

	public void setChiSoKyThuat(int chiSoKyThuat) {
		ChiSoKyThuat = chiSoKyThuat;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public int getSoDienThoai() {
		return SoDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		SoDienThoai = soDienThoai;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}

	public int getCanNang() {
		return canNang;
	}

	public void setCanNang(int canNang) {
		this.canNang = canNang;
	}

	public String getAvartar() {
		return avartar;
	}

	public void setAvartar(String avartar) {
		this.avartar = avartar;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int soAo, int soBanThang, int chiSoSut, int chiSoChuyen, int chiSoKyThuat,
			Team team, int soDienThoai, String userName, String passWord, int chieuCao, int canNang, String avartar) {
		super();
		this.id = id;
		this.name = name;
		SoAo = soAo;
		SoBanThang = soBanThang;
		ChiSoSut = chiSoSut;
		ChiSoChuyen = chiSoChuyen;
		ChiSoKyThuat = chiSoKyThuat;
		this.team = team;
		SoDienThoai = soDienThoai;
		this.userName = userName;
		this.passWord = passWord;
		this.chieuCao = chieuCao;
		this.canNang = canNang;
		this.avartar = avartar;
	}
	
	

}
