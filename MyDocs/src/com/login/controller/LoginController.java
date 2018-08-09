package com.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("*.app")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		
		String username=request.getParameter("userName");
		String password = request.getParameter("password");

		switch (action) {
		case "/login.app":
			
			if(username.equals("admin") && password.equals("admin")) {
				session.setAttribute("username", username);
				response.sendRedirect("success.jsp");	
			}
			else
				response.sendRedirect("error.jsp");	
			break;
		case "/logout.app":
			response.sendRedirect("login.jsp");
			session.invalidate();
	
	}
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
