package com.cdio.planx.control;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;

import com.cdio.planx.dao.CompetitionDao;
import com.cdio.planx.dao.impl.CompetitionDaoImpl;
import com.cdio.planx.domain.Competition;
import com.cdio.planx.utils.CdioUtils;

public class IssueCompetitionServlet extends HttpServlet {

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
		String filePath = getServletContext().getRealPath("/") + "\\upload\\";

		String name = session.getAttribute("name").toString();
		
		try {
			Competition competition =CdioUtils.CompetitionFileUpload(request, filePath,name);
			CompetitionDao cd = new CompetitionDaoImpl();
			cd.addCompe(competition);
		} catch (Exception e) {
		
			response.sendRedirect("mainmenu.jsp");
			return;
		}
		response.sendRedirect("mainmenu.jsp");

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
