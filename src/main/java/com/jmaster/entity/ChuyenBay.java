package com.jmaster.entity;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay { 

	@Id
	@Column(name = "macb")
	private String maCB;

	
	@Column(name = "chi_phi")
	private int chiPhi;
	
	
	@Column(name = "do_dai") 
	private int doDai;

	
	@Column(name = "ga_den")
	private String gaDen;

	
	@Column(name = "ga_di")
	private String gaDi;

	
	@Column(name = "gio_den")
	@Temporal(TemporalType.TIME)
	private Date gioDen;
	
	
	@Column(name = "gio_di")
	@Temporal(TemporalType.TIME)
	private Date gioDi;


	public String getMaCB() {
		return maCB;
	}


	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}


	public int getChiPhi() {
		return chiPhi;
	}


	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}


	public int getDoDai() {
		return doDai;
	}


	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}


	public String getGaDen() {
		return gaDen;
	}


	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}


	public String getGaDi() {
		return gaDi;
	}


	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}


	public Date getGioDen() {
		return gioDen;
	}


	public void setGioDen(Date gioDen) {
		this.gioDen = gioDen;
	}


	public Date getGioDi() {
		return gioDi;
	}


	public void setGioDi(Date gioDi) {
		this.gioDi = gioDi;
	}



	
}