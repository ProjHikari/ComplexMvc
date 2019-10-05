package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class validation
 */
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		HttpSession ht = request.getSession();
		String username = request.getParameter("usnme");
		String password = request.getParameter("pwd");
		DataBean bean1=new DataBean();
		//System.out.println(username+password);
		bean1.setUsername(username);
		bean1.setPassword(password);
		String dept=bean1.valid();
		System.out.println("Checkpoint 1");
		//System.out.println(dept);
		
		if(dept.equals(null))
		{
			
			String msg="Invalid username/password.";
			ht.setAttribute("Error",msg);
			response.sendRedirect("index.jsp");
		}
		else if(dept.equals("ADMIN"))
		{
			response.sendRedirect("admin.jsp");
		}
		else
		{
			response.sendRedirect("normal.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
