package com.kamesh.criminalrecord.models;

import java.sql.Date;

public class AuthorityModel {
	private String officer_id; 
	private String name;
	private Date join_date; 
	private String password;
	private String roles;
	
	public AuthorityModel() {
		
	}
	public AuthorityModel(String officer_id, String name, Date join_date, String password, String roles) {
		super();
		this.officer_id = officer_id;
		this.name = name;
		this.join_date = join_date;
		this.password = password;
		this.roles = roles;
	}
	public String getOfficer_id() {
		return officer_id;
	}
	public void setOfficer_id(String officer_id) {
		this.officer_id = officer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
}
