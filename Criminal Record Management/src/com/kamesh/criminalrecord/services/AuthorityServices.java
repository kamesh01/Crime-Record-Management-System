package com.kamesh.criminalrecord.services;

import java.sql.ResultSet;
import java.util.List;

import com.kamesh.criminalrecord.models.AuthorityModel;

public interface AuthorityServices {
	
	int login(String username, String password, String role) throws Exception;
	
	int register(AuthorityModel authModel) throws Exception;

	List<AuthorityModel> getAllAuthority();
	
	AuthorityModel findById(String id) throws Exception;

//	AuthorityModel findByName(String name) throws Exception;

//	AuthorityModel findByRoles(String role) throws Exception;
	
	ResultSet getRoles();
	
	int deleteAuthority(String id);

	int updateDetailsById(String Id) throws Exception;
}
