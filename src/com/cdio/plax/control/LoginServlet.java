package com.cdio.plax.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdio.planx.dao.StudentDao;
import com.cdio.planx.dao.impl.StudentDaoImpl;
import com.cdio.planx.domain.Student;
import com.cdio.planx.domain.User;
import com.cdio.planx.service.LoginService;
import com.cdio.planx.utils.CdioUtils;

public class LoginServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String userID = request.getParameter("userID").trim();
		String userPw = request.getParameter("userPw").trim();
		String userPermi = request.getParameter("userPermi").trim();
		session.setAttribute("userID", userID);
		request.setAttribute("userID", userID);
		request.setAttribute("userPw", userPw);
		request.setAttribute("userPermi",userPermi);
		
		if (CdioUtils.isEmptyStr(userID) || CdioUtils.isEmptyStr(userPw)) {
			request.setAttribute("error", "帐号和密码不能为空！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		
		LoginService ls = new LoginService();
		User user = new User();
		user = ls.isLogin(userID, userPw, userPermi);
		
		if(user==null){
			request.setAttribute("error", "帐号或密码输入错误！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			response.sendRedirect("mainmenu.jsp");
		}

	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
