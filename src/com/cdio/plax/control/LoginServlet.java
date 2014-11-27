package com.cdio.plax.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdio.planx.dao.StudentDao;
import com.cdio.planx.dao.impl.StudentDaoImpl;
import com.cdio.planx.domain.Student;

public class LoginServlet extends HttpServlet {


	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userID=request.getParameter("userID").trim();
		String userPw=request.getParameter("userPw").trim();
		String userType=request.getParameter("userType").trim();
		StudentDao sd = new StudentDaoImpl();
		Student stu=sd.searchStu(userID);
	//	System.out.println(stu.getStuPw());
		if(stu==null || stu.getStuPw()!=userPw){
			//request.setAttribute("error","帐号或密码输入错误！");
			//RequestDispatcher requestdispatcher=request.getRequestDispatcher("login.jsp");
			//requestdispatcher.forward(request, response);
			response.sendRedirect("login.jsp");
		}
		else{
			
			System.out.println(stu.getStuPw());
			response.sendRedirect("mainmenu.jsp");
			
		}
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
		
	}


}
