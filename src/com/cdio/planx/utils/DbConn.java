/**
 * 
 */
package com.cdio.planx.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Administrator
 * 
 */
public class DbConn {

	private static String username = null;
	private static String password = null;
	private static String drivername = null;
	private static String url = null;

	static {
		Properties ps = new Properties();
		try {
			ps.load(DbConn.class.getResourceAsStream("/db.properties"));
			drivername = ps.getProperty("drivername");
			url = ps.getProperty("url");
			username = ps.getProperty("username");
			password = ps.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(drivername);
			// conn = DriverManager.getConnection(url, username, password);
			conn = DriverManager.getConnection(url + "?user=" + username
					+ "&password=" + password + "&useUnicode=true"
					+ "&characterEncoding=UTF-8");
			// System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void free(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * public static void main(String[] args) { Connection conn = null;
	 * PreparedStatement stmt = null; ResultSet rs = null; try {
	 * conn=DbConn.getConn(); System.out.println("OK!"); String sql =
	 * "select * from Admin"; // String
	 * sql1="insert into Admin value('fasd','dsa','dsa',2)"; stmt =
	 * conn.prepareStatement(sql); // stmt.setString(1, "123");
	 * rs=stmt.executeQuery(); // stmt.executeUpdate(sql1); while(rs.next()){
	 * System.out.println(rs.getString("adminName")); //
	 * System.out.println("stuID："+rs.getString("adminName")); //
	 * System.out.println("stuID："+new
	 * String(rs.getString("adminName").getBytes("ISO-8859-1"),"utf-8"));
	 * 
	 * // System.out.println("stuName："+rs.getString("adminPw")); //
	 * System.out.println("stuName："+new
	 * String(rs.getString("adminPw").getBytes("ISO-8859-1"),"utf-8"));
	 * 
	 * } } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * }
	 */
}
