package com.example.demo.Team;

import java.util.ArrayList;
import java.util.Collection;
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

import com.example.demo.HLV.HLV;
import com.example.demo.Match.TranDau;
import com.example.demo.player.Player;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="team")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String soDienThoai;
	
	@OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Player> players;
	
	@Column
	private int TranWin;
	
	@Column
	private int TranThua;
	
	@Column
	private int TranHoa;
	
	@Column
	private String logo;
//	
	@OneToOne
	@JoinColumn(name = "captain_id",referencedColumnName = "id")
	private Player capTainPlayer;
//	
	@OneToOne
	@JoinColumn(name="hlv_id",referencedColumnName = "id")
	private HLV hlv;
	
//	@OneToOne
//	@JsonIgnore
//	@JoinColumn(name = "trandau_id")
//	private TranDau tranDau;
//	

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
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public int getTranWin() {
		return TranWin;
	}
	public void setTranWin(int tranWin) {
		TranWin = tranWin;
	}
	public int getTranThua() {
		return TranThua;
	}
	public void setTranThua(int tranThua) {
		TranThua = tranThua;
	}
	public int getTranHoa() {
		return TranHoa;
	}
	public void setTranHoa(int tranHoa) {
		TranHoa = tranHoa;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Player getCapTainPlayer() {
		return capTainPlayer;
	}
	public void setCapTainPlayer(Player capTainPlayer) {
		this.capTainPlayer = capTainPlayer;
	}
	public HLV getHlv() {
		return hlv;
	}
	public void setHlv(HLV hlv) {
		this.hlv = hlv;
	}
	public Team(int id, String name, String soDienThoai, List<Player> players, int tranWin, int tranThua, int tranHoa,
			String logo, Player capTainPlayer, HLV hlv) {
		super();
		this.id = id;
		this.name = name;
		this.soDienThoai = soDienThoai;
		this.players = players;
		TranWin = tranWin;
		TranThua = tranThua;
		TranHoa = tranHoa;
		this.logo = logo;
		this.capTainPlayer = capTainPlayer;
		this.hlv = hlv;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
