/**
 * 
 */
package com.cdio.planx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cdio.planx.dao.CompetitionDao;
import com.cdio.planx.domain.Competition;
import com.cdio.planx.domain.Notice;
import com.cdio.planx.exception.AnnounceInfoException;
import com.cdio.planx.exception.PersonInfoException;
import com.cdio.planx.utils.DbConn;

/**
 * @author Administrator
 * 
 */
public class CompetitionDaoImpl implements CompetitionDao {
	@Override
	public List<Competition> listCompe() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Competition> listCompe = new ArrayList<Competition>();
		String sql = "select * from Competition";
		try {
			conn = DbConn.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Competition competition = new Competition();
				competition.setCompetitionAuthor(rs
						.getString("competitionAuthor"));
				competition.setCompetitionContent(rs
						.getString("competitionContent"));
				competition.setCompetitionDate(rs.getDate("competitionDate"));
				competition.setCompetitionID(rs.getString("competitionID"));
				competition.setCompetitionFile(rs.getString("competitionFile"));
				competition.setCompetitionTitle(rs
						.getString("competitionTitle"));
				listCompe.add(competition);
			}
		} catch (SQLException e) {
			throw new AnnounceInfoException("");
		}
		return listCompe;

	}

	@Override
	public int addCompe(Competition competition) {
		Connection conn = null;
		PreparedStatement ps = null;
		int i = 0;
		String num = listCompe().size() + "";
		String sql = "insert into Competition(competitionID,competitionContent,competitionDate,competitionAuthor,competitionFile,competitionTitle)values(?,?,?,?,?,?)";

		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			ps.setString(2, competition.getCompetitionContent());
			ps.setDate(3, new java.sql.Date(competition.getCompetitionDate()
					.getTime()));
			ps.setString(4, competition.getCompetitionAuthor());
			ps.setString(5, competition.getCompetitionFile());
			ps.setString(6, competition.getCompetitionTitle());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			throw new AnnounceInfoException("");
		} finally {

			DbConn.free(null, ps, conn);
		}
		return i;
	}

	@Override
	public Competition searchById(String id) {
		Competition com = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from Competition where competitionID=?";
		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				com = new Competition();
				com.setCompetitionAuthor(rs.getString("competitionAuthor"));
				com.setCompetitionContent(rs.getString("competitionContent"));
				com.setCompetitionDate(rs.getDate("competitionDate"));
				com.setCompetitionFile(rs.getString("competitionFile"));
				com.setCompetitionTitle(rs.getString("competitionTitle"));
				com.setCompetitionID(id);
			}
		} catch (SQLException e) {
			throw new AnnounceInfoException("");
		} finally {
			DbConn.free(rs, ps, conn);
		}
		return com;
	}
}
