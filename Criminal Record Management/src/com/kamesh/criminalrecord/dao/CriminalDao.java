package com.kamesh.criminalrecord.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kamesh.criminalrecord.models.CriminalModel;
import com.kamesh.criminalrecord.services.CriminalServices;

public class CriminalDao implements CriminalServices {

	@Override
	public int registerCriminal(CriminalModel criminalModel) throws Exception {
		// TODO Auto-generated method stub
		int status = 0;
		String sql = "INSERT INTO `criminalrecord`.`criminals_record` (`criminal_id`, `full_name`, `mobile`, `assigned_work`, `blood_group`, `crime_type`, `dob`, `entered_time`) VALUES (?,?,?,?,?,?,?,?);";
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConnectionDao.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, criminalModel.getCriminal_id());
			ps.setString(2, criminalModel.getFull_name());
			ps.setLong(3, criminalModel.getMobile());
			ps.setString(4, criminalModel.getAssigned_work());
			ps.setString(5, criminalModel.getBlood_group());
			ps.setString(6, criminalModel.getCrime_type());
			ps.setDate(7, criminalModel.getDob());
			ps.setTime(8, criminalModel.getentered_time());
			status = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ps.close();
			con.close();
		}
		return status;
	}

}
