/**
 * 
 */
package com.cdio.planx.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cdio.planx.dao.GroomDao;
import com.cdio.planx.domain.Groom;
import com.cdio.planx.domain.Student;
import com.cdio.planx.exception.PersonInfoException;
import com.cdio.planx.utils.DbConn;

/**
 * @author Administrator
 *
 */
public class GroomDaoImpl implements GroomDao {

	@Override
	public List<Groom> listGroom() {
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs=null;
		List<Groom> listgrooms=new ArrayList<Groom>();
		String sql = "select * from Groom";
		
		try {
			conn=DbConn.getConn();
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				Groom groom = new Groom();
				groom.setGroomID(rs.getString("stuAcademy"));
				
				String groomTitle;
				String groomPic;
				String groomBrief;
				Date groomDate;
				String groomType;
			}
		}catch(SQLException e) {
			throw new PersonInfoException("");
			
		}
		return null;
	}

	@Override
	public int addGroom(Groom groom) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delGroom(String groomID) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
