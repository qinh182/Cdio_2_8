package com.cdio.planx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cdio.planx.dao.NoticeDao;
import com.cdio.planx.domain.Competition;
import com.cdio.planx.domain.Notice;
import com.cdio.planx.exception.AnnounceInfoException;
import com.cdio.planx.exception.PersonInfoException;
import com.cdio.planx.utils.DbConn;

public class NoticeDaoImpl implements NoticeDao {

	public static int NOTICE_NUM;
	@Override
	public List<Notice> listNotice(String noticeAcademy) {
		NOTICE_NUM = 0;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Notice> lsitNotice = new ArrayList<Notice>();
		String sql = "select * from Notice";
		try {
			conn = DbConn.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				NOTICE_NUM++;
				if (!rs.getString("noticeAcademy").equals(noticeAcademy))
					continue;
				Notice notice = new Notice();
				notice.setNoticeAuthor(rs.getString("noticeAuthor"));
				notice.setNoticeContent(rs.getString("noticeContent"));
				notice.setNoticeDate(rs.getDate("noticeDate"));
				notice.setNoticeID(rs.getString("noticeID"));
				notice.setNoticePermi(rs.getInt("noticePermi"));
				notice.setNoticeAcademy(rs.getString("noticeAcademy"));
				notice.setNoticeClass(rs.getString("noticeClass"));
				notice.setNoticeGrade(rs.getString("noticeGrade"));
				lsitNotice.add(notice);
			}
		} catch (SQLException e) {
			throw new AnnounceInfoException("");

		}
		return lsitNotice;
	}

	@Override
	public int addNotice(Notice notice) {
		Connection conn = null;
		PreparedStatement ps = null;
		int i = 0;
		String sql = "insert into Notice(noticeID,noticeContent,noticeDate,noticeAuthor,noticePermi,noticeClass,noticeGrade,noticeAcademy)values(?,?,?,?,?,?,?,?)";

		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, notice.getNoticeID());
			ps.setString(2, notice.getNoticeContent());
			ps.setDate(3, new java.sql.Date(notice.getNoticeDate().getTime()));
			ps.setString(4, notice.getNoticeAuthor());
			ps.setInt(5, notice.getNoticePermi());
			ps.setString(6, notice.getNoticeClass());
			ps.setString(7, notice.getNoticeGrade());
			ps.setString(8, notice.getNoticeAcademy());
			i = ps.executeUpdate();

		} catch (SQLException e) {
		//	throw new AnnounceInfoException("");
		} finally {

			DbConn.free(null, ps, conn);
		}
		return i;
	}

	@Override
	public Notice searchById(String id) {
		Notice notice = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from Notice where noticeID=?";
		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				notice = new Notice();
				notice.setNoticeAuthor(rs.getString("competitionAuthor"));
				notice.setNoticeContent(rs.getString("competitionContent"));
				notice.setNoticeDate(rs.getDate("competitionDate"));
				notice.setNoticeAcademy(rs.getString("noticeAcademy"));
				notice.setNoticeClass(rs.getString("noticeClass"));
				notice.setNoticeGrade(rs.getString("noticeGrade"));
				notice.setNoticePermi(rs.getInt("noticePermi"));
				notice.setNoticeID(id);
			}
		} catch (SQLException e) {
			throw new AnnounceInfoException("");
		} finally {
			DbConn.free(rs, ps, conn);
		}
		
		
		return notice;
	}

}
