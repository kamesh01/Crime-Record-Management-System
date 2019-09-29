package com.kamesh.criminalrecord.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kamesh.criminalrecord.dao.AuthorityDao;
import com.kamesh.criminalrecord.models.AuthorityModel;
import com.kamesh.criminalrecord.services.AuthorityServices;

/**
 * Servlet implementation class ShowOneAuthority
 */
@WebServlet("/ShowOneAuthority")
public class ShowOneAuthority extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String officerId = request.getParameter("officerId");
		AuthorityServices authDao = new AuthorityDao();
		try {
//			AuthorityModel oneAuthority = authDao.findById(officerId);
			AuthorityModel authModel = authDao.findById(officerId);
			response.sendRedirect("./ResultScreens/showAuthoritiesDetails.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
