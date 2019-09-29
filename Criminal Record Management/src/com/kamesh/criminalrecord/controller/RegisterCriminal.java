package com.kamesh.criminalrecord.controller;

import java.awt.image.SampleModel;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kamesh.criminalrecord.dao.CriminalDao;
import com.kamesh.criminalrecord.models.CriminalModel;
import com.kamesh.criminalrecord.services.CriminalServices;

/**
 * Servlet implementation class RegisterCriminal
 */
@WebServlet("/RegisterCriminal")
public class RegisterCriminal extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterCriminal() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		final String criminal_id = request.getParameter("criminalId");
		final String full_name = request.getParameter("fullName");
		final long mobile = Long.parseLong(request.getParameter("mobile"));
		final String assigned_work = request.getParameter("assignedWork");
		final String blood_group = request.getParameter("bloodGroup");
		final String crime_type = request.getParameter("crimeType");

		final Date dob = Date.valueOf(request.getParameter("dob"));

		final Time entered_time = new Time(new java.util.Date().getTime());
		boolean dna = false;
		boolean finger_prints = false;
		boolean images = false;
		boolean retina = false;

		final String health_condition = request.getParameter("healthCondition");
		final String jail_name = request.getParameter("jailName");
		final int cell_no = Integer.parseInt(request.getParameter("cellNo"));
		final int punishment_duration = Integer.parseInt(request.getParameter("punishmentDuration"));

		Date meeting_date = null;
		String meeting_person = null;
		Time meeting_time = null;
		
		CriminalModel criminalModel = new CriminalModel(criminal_id, full_name, mobile, assigned_work, blood_group,
				crime_type, dob, entered_time, dna, finger_prints, images, retina, health_condition, jail_name, cell_no,
				punishment_duration, meeting_date, meeting_person, meeting_time);
		try {
			if(criminalModel != null) {
				CriminalServices criminalDao = new CriminalDao();
				criminalDao.registerCriminal(criminalModel);
				response.sendRedirect("./AuthorityHeaders/Administrator.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
