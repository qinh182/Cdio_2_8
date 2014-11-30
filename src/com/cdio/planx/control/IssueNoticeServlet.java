package com.cdio.planx.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdio.planx.dao.NoticeDao;
import com.cdio.planx.dao.impl.NoticeDaoImpl;
import com.cdio.planx.domain.Notice;

public class IssueNoticeServlet extends HttpServlet {

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
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY><h2>");
		String noticeContent = request.getParameter("noticeContent").trim();
		Notice notice = new Notice();
		notice.setNoticeID(session.getAttribute("listNoticeSize").toString());
		notice.setNoticeAcademy(session.getAttribute("academy").toString());
		notice.setNoticeAuthor(session.getAttribute("name").toString());
		notice.setNoticeClass(session.getAttribute("class").toString());
		notice.setNoticeContent(noticeContent);
		notice.setNoticeDate(new Date());
		notice.setNoticeGrade(session.getAttribute("grade").toString());
		notice.setNoticePermi(Integer.parseInt(session.getAttribute("permi")
				.toString()));

		NoticeDao nd = new NoticeDaoImpl();
		if (nd.addNotice(notice) == 0)
			out.print("发布失败！现返回主页面...");
		else
			out.print("发布成功！现返回主页面...");
		out.println("</h2>  </BODY>");
		out.println("</HTML>");
		try {
			response.sendRedirect("mainmenu.jsp");
		} finally {
			out.flush();
			out.close();
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
