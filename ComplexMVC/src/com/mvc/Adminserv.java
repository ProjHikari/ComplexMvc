package com.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Adminserv
 */
public class Adminserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession hs=request.getSession();
		String NID = request.getParameter("uid");
		String Nusername = request.getParameter("uname");
		String Npass = request.getParameter("upass");
		String Nemail = request.getParameter("uemail");
		String Ndept = request.getParameter("udept");
		String Nphone = request.getParameter("uphone");
		String Nsalary = request.getParameter("usal");
		DataBean bean2 = new DataBean();
		bean2.setUsername(Nusername);
		bean2.setUid(NID);
		bean2.setPassword(Npass);
		bean2.setDept(Ndept);
		bean2.setPhone(Nphone);
		bean2.setSalary(Nsalary);
		bean2.setEmail(Nemail);
		boolean flag=bean2.update();
		if(flag) {
			String msg1="Details successfully updated";
			response.sendRedirect("admin.jsp");
			hs.setAttribute("success",msg1);
		}
		else {
			String msg1="Update failed";
			response.sendRedirect("admin.jsp");
			hs.setAttribute("failure",msg1);
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
