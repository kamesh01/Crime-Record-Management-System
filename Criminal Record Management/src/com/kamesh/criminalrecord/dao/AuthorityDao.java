package com.kamesh.criminalrecord.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kamesh.criminalrecord.models.AuthorityModel;
import com.kamesh.criminalrecord.services.AuthorityServices;

public class AuthorityDao implements AuthorityServices {

	@Override
	public int login(String userId, String password, String role) throws Exception {
		// TODO Auto-generated method stub
		int status = 0;
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "SELECT * FROM authorities WHERE officer_id = ? AND password = ? AND roles = ?";
		try {
			con = ConnectionDao.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ps.setString(3, role);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				status = 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ps.close();
			con.close();
		}
		return status;
	}

	@Override
	public AuthorityModel findById(String id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "SELECT * FROM authorities WHERE officer_Id = ?";
		AuthorityModel authModel = new AuthorityModel();
		try {
			con = ConnectionDao.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				authModel.setOfficer_id(rs.getString(1));
				authModel.setName(rs.getString(2));
				authModel.setJoin_date(rs.getDate(3));
				authModel.setPassword(rs.getString(4));
				authModel.setRoles(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ps.close();
			con.close();
		}
		return authModel;
	}

	@Override
	public List<AuthorityModel> getAllAuthority() {
		// TODO Auto-generated method stub
		List<AuthorityModel> list = new ArrayList<AuthorityModel>();
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "SELECT * FROM authorities ";
		try {
			con = ConnectionDao.getConnection();
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AuthorityModel authModel = new AuthorityModel(rs.getString(1), rs.getString(2), rs.getDate(3),
						rs.getString(4), rs.getString(5));
				list.add(authModel);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int deleteAuthority(String id) {
		// TODO Auto-generated method stub
		int status = 0;
		String sql = "DELETE FROM authorities WHERE officer_id = ?";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConnectionDao.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			status = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return status;
	}

	@Override
	public int updateDetailsById(String Id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int register(AuthorityModel authModel) throws Exception {
		// TODO Auto-generated method stub
		int status = 0;
		String sql = "INSERT INTO authorities (officer_id, name, join_date, password, roles) values (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConnectionDao.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, authModel.getOfficer_id());
			ps.setString(2, authModel.getName());
			ps.setDate(3, authModel.getJoin_date());
			ps.setString(4, authModel.getPassword());
			ps.setString(5, authModel.getRoles());
			status = ps.executeUpdate();
		} finally {
			ps.close();
			con.close();
		}
		return status;
	}

	@Override
	public ResultSet getRoles() {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = ConnectionDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select distinct roles from criminalrecord.authorities;");
			ResultSet rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
