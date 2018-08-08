package com.resume.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.resume.bean.Resume;

/**
 * Servlet implementation class ResumeController
 */
@WebServlet("/resume")
public class ResumeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
//		out.println("<h1>hello</h1>");
		Resume resume=new Resume(request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("gender"), request.getParameter("qualification"), request.getParameter("dob"), request.getParameter("hobbies"), request.getParameter("address"), request.getParameter("email"), request.getParameter("weburl"), request.getParameter("contact"), request.getParameter("description"),request.getParameterValues("skill"));
		request.setAttribute("resume", resume);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
