package com.kamesh.criminalrecord.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kamesh.criminalrecord.dao.AuthorityDao;
import com.kamesh.criminalrecord.models.AuthorityModel;
import com.kamesh.criminalrecord.services.AuthorityServices;

/**
 * Servlet implementation class RegisterAuthority
 */
@WebServlet("/RegisterAuthority")
public class RegisterAuthority extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterAuthority() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String officerId = request.getParameter("officerId").toUpperCase();
		String name = request.getParameter("name");
		Date joinDate = new Date(System.currentTimeMillis()); // ex: 1997-08-28
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		AuthorityModel authorityModel = new AuthorityModel(officerId, name, joinDate, password, role);
		try {
			if (authorityModel != null) {
				AuthorityServices authority = new AuthorityDao();
				authority.register(authorityModel);
				response.sendRedirect("./ResultScreens/registerAuthority.jsp?msg=registered");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
