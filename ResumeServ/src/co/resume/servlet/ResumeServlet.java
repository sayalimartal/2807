package co.resume.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResumeServlet
 */
@WebServlet("/resume")
public class ResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<h1>hello</h1>");
		out.println("<h1>First Name: "+request.getParameter("firstName")+"\n</h1>");
		out.println("<h1>Last Name: "+request.getParameter("lastName")+"\n</h1>");
		out.println("<h1>Gender: "+request.getParameter("gender")+"\n</h1>");
		out.println("<h1>Highest Qualification: "+request.getParameter("qualification")+"\n</h1>");
		out.println("<h1>Date of Birth: "+request.getParameter("dob")+"\n</h1>");
		out.println("<h1>Hobbies: "+request.getParameter("hobbies")+"\n</h1>");
		out.println("<h1>Address: "+request.getParameter("address")+"\n</h1>");
		out.println("<h1>Skills: "+request.getParameter("skill")+"\n</h1>");
		out.println("<h1>Email: "+request.getParameter("email")+"\n</h1>");
		out.println("<h1>Website: "+request.getParameter("weburl")+"\n</h1>");
		out.println("<h1>Contact No: "+request.getParameter("contact")+"\n</h1>");
		out.println("<h1>Description: "+request.getParameter("description")+"\n</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
