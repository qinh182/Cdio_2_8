package com.cdio.planx.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdio.planx.dao.impl.CompetitionDaoImpl;
import com.cdio.planx.dao.impl.ResourceDaoImpl;
import com.cdio.planx.domain.Competition;
import com.cdio.planx.domain.Resource;

public class DetailServlet extends HttpServlet {

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

		response.setContentType("text/html");
		String type = request.getParameter("type");
		Competition com = new Competition();
		Resource res = new Resource();
		String comId = null;
		String resId = null;
	if(type.equals("1")){
		comId = request.getParameter("competition");
		com =  (new CompetitionDaoImpl()).searchById(comId);
		request.setAttribute("com", com);
		request.getRequestDispatcher("messagedetail.jsp")
		.forward(request, response);
	}
	if(type.equals("3")){
		resId = request.getParameter("res");
		res = (new ResourceDaoImpl()).searchById(resId);
		System.out.println("*"+res.getResAuthor());
		request.setAttribute("res", res);
		request.getRequestDispatcher("messagedetail.jsp")
		.forward(request, response);
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

		doGet( request,response );
	}

}
