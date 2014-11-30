/**
 * 
 */
package com.cdio.planx.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cdio.planx.dao.ResourceDao;
import com.cdio.planx.domain.Resource;
import com.cdio.planx.exception.AnnounceInfoException;
import com.cdio.planx.exception.PersonInfoException;
import com.cdio.planx.utils.DbConn;

/**
 * @author Administrator
 * 
 */
public class ResourceDaoImpl implements ResourceDao {

	@Override
	public List<Resource> listRes() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Resource> listRes = new ArrayList<Resource>();
		String sql = "select * from Resource";
		try {
			conn = DbConn.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Resource res = new Resource();
				res.setResName(rs.getString("resName"));
				res.setResDate(rs.getDate("resDate"));
				res.setResDescribe(rs.getString("resDescribe"));
				res.setResID(rs.getString("resID"));
				res.setResPic(rs.getString("resPic"));
				res.setResType(rs.getString("resType"));
				listRes.add(res);
			}
		} catch (SQLException e) {
			throw new AnnounceInfoException("");

		}
		return listRes;
	}

	@Override
	public int addRes(Resource res) {
		Connection conn = null;
		PreparedStatement ps=null;
		File file =null; 
		FileInputStream fin =null;
		int i=0;
		String sql="insert into Resource(resID,resName,resType,resDate,resAuthor,resDescribe,resPic,resFile)values(?,?,?,?,?,?,?,?)";
		
		try {
			conn=DbConn.getConn();
			ps=conn.prepareStatement(sql);
			ps.setString(1,res.getResID());
			ps.setString(2,res.getResName());
			ps.setString(3,res.getResType());
			ps.setDate(4,(Date) res.getResDate());
			ps.setString(5,res.getResAuthor());
			ps.setString(6,res.getResDescribe());
			file =	new File(res.getResPic());
			fin = new FileInputStream(file);
			ps.setBinaryStream(7, fin,file.length());
			file = new File(res.getResPic());
			fin = new FileInputStream(file);
			ps.setBinaryStream(8, fin,file.length());
			i=ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new AnnounceInfoException("");
		} catch (FileNotFoundException e) {
			throw new AnnounceInfoException("");
		}finally{
			
			DbConn.free(null, ps, conn);
		}
		
		
		return i;
	}

	@Override
	public int delRes(Resource resID) {
		Connection conn = null;
		Statement stmt=null;
		int i=0;
		String sql="delete from Resource where resID="+resID;
		
		try {
			conn=DbConn.getConn();
			stmt=conn.createStatement();
			i=stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			throw new AnnounceInfoException("");
		}
		return i;
	}

	@Override
	public int downRes(Resource resID) {
		
		return 0;
	}
	
	private void setpath(String path){
		
		
		
	}

}
