package com.cdio.planx.control;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;

import com.cdio.planx.dao.ResourceDao;
import com.cdio.planx.dao.impl.ResourceDaoImpl;
import com.cdio.planx.domain.Resource;
import com.cdio.planx.utils.CdioUtils;

public class UploadServlet extends HttpServlet {

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
		String paths = getServletContext().getRealPath("/")+"upload";
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String name = session.getAttribute("name").toString();
		String filePath = getServletContext().getRealPath("/") + "\\upload\\";
		
		try{
			Resource res = CdioUtils.ResFileUpload(request, filePath, name);
			ResourceDao rd = new ResourceDaoImpl();
			rd.addRes(res);
			
		}catch(Exception e){
			e.getStackTrace();
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
