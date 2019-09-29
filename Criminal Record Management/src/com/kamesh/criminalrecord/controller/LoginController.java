package com.kamesh.criminalrecord.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kamesh.criminalrecord.dao.AuthorityDao;
import com.kamesh.criminalrecord.services.AuthorityServices;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		boolean isAuthorized = false;
		AuthorityServices authority = new AuthorityDao();
		HttpSession session = request.getSession();
		try {
			isAuthorized = (authority.login(username, password, role)) == 1?true:false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(isAuthorized) {
			if (isAuthorized && role.equalsIgnoreCase("administrator")) {
				session.setAttribute("username", username);
				response.sendRedirect("./AuthorityHeaders/Administrator.jsp?msg=success");
			}else if (isAuthorized && role.equalsIgnoreCase("cbi officer")) {
				session.setAttribute("username", username);
				response.sendRedirect("./AuthorityHeaders/CbiOfficer.jsp?msg=success");
			}else if (isAuthorized && role.equalsIgnoreCase("jail superitendent")) {
				session.setAttribute("username", username);
				response.sendRedirect("./AuthorityHeaders/JailSuperitendent.jsp?msg=success");
			}else if (isAuthorized && role.equalsIgnoreCase("judge")) {
				session.setAttribute("username", username);
				response.sendRedirect("./AuthorityHeaders/Judge.jsp?msg=success");
			}else if (isAuthorized && role.equalsIgnoreCase("police officer")) {
				session.setAttribute("username", username);
				response.sendRedirect("./AuthorityHeaders/PoliceOfficer.jsp?msg=success");
			}
		}else {
			response.sendRedirect("index.jsp?msg=invalid");
		}
	}

}
