/**
 * 
 */
package com.cdio.planx.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.cdio.planx.dao.AdminDao;
import com.cdio.planx.domain.Admin;
import com.cdio.planx.exception.CdioException;
import com.cdio.planx.utils.DbConn;

/**
 * @author Administrator
 *
 */
public class AdminDaoImpl implements AdminDao {

	public List<Admin> listAdmins() {
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs;
		String sql = "select * from Admin";
		try{
			stmt = conn.createStatement();
		}catch(SQLException e){
			throw new CdioException(""); 
		}finally{
			return null;
		}
	}

	
	public boolean isLogin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
