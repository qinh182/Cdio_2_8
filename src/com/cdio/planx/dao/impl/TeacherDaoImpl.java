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

import com.cdio.planx.dao.TeacherDao;
import com.cdio.planx.domain.Teacher;
import com.cdio.planx.exception.CdioException;
import com.cdio.planx.exception.PersonInfoException;
import com.cdio.planx.utils.DbConn;

/**
 * @author Administrator
 *
 */
public class TeacherDaoImpl implements TeacherDao {

	@Override
	public List<Teacher> listTeacher() {
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs=null;
		List<Teacher> listTeachers=new ArrayList<Teacher>();
		String sql = "select * from Teacher";
		try {
			conn=DbConn.getConn();
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				Teacher tea= new Teacher();
				tea.setTeacherAcademy(rs.getString("teacherAcademy"));
				tea.setTeacherCont(rs.getString("teacherCont"));
				tea.setTeacherID(rs.getString("teacherID"));
				tea.setTeacherName(rs.getString("teacherName"));
				tea.setTeacherPermi(rs.getInt("teacherPermi"));
				tea.setTeacherPw(rs.getString("teacherPw"));
				tea.setTeacherSex(rs.getString("teacherSex"));
				listTeachers.add(tea);	
			}
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		return listTeachers;
	}

	@Override
	public int addTeacher(Teacher teacher) {
		Connection conn = null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into Teacher(teacherID,teacherPw,teacherName,teacherSex,teacherPermi,teacherCont,teacherAcademy)values(?,?,?,?,?,?,?)";
		try {
			conn=DbConn.getConn();
			ps=conn.prepareStatement(sql);
			ps.setString(1,teacher.getTeacherID());
			ps.setString(2,teacher.getTeacherPw());
			ps.setString(3,teacher.getTeacherName());
			ps.setString(4,teacher.getTeacherSex());
			ps.setInt(5,teacher.getTeacherPermi());
			ps.setString(6,teacher.getTeacherCont());
			ps.setString(7,teacher.getTeacherAcademy());
			i=ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		return i;
	}

	@Override
	public int deleteTeacher(String teacherID) {
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs=null;
		int i=0;
		String sql="delete from Teacher where teacherID="+teacherID;
		
		try {
			conn=DbConn.getConn();
			stmt=conn.createStatement();
			i=stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		return i;
	}

	@Override
	public int updateTeacherInfo(Teacher teacher) {
		int i=0;
		Connection conn = null;
		PreparedStatement ps=null;
		String sql="update Teacher set teacherName=?,teacherSex=?,teacherPermi=?,teacherCont=?,teacherAcademy=? where teacherID="+teacher.getTeacherID();
		
		try {
			conn=DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,teacher.getTeacherName());
			ps.setString(2,teacher.getTeacherSex());
			ps.setInt(3,teacher.getTeacherPermi());
			ps.setString(4,teacher.getTeacherCont());
			ps.setString(5,teacher.getTeacherAcademy());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		
		return i;
	}

	@Override
	public int updateTeacherPw(String teacherID, String teacherPw) {
		int i=0;
		Connection conn = null;
		PreparedStatement ps=null;
		String sql="update Teacher set teacherPw=?where teacherID="+teacherID;
		try {
			conn=DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,teacherPw);
			i=ps.executeUpdate();
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		return i;
	}

	@Override
	public Teacher searchTeacher(String teacherID) {
		Teacher teacher = null;
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql = "select * from Teacher where teacherID=?";
		try{
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, teacherID);
			rs = ps.executeQuery();
			teacher = new Teacher();
			while(rs.next()){
				teacher.setTeacherAcademy(rs.getString("teacherAcademy"));
				teacher.setTeacherCont(rs.getString("teacherCont"));
				teacher.setTeacherID(rs.getString("teacherID"));
				teacher.setTeacherName(rs.getString("teacherName"));
				teacher.setTeacherPermi(rs.getInt("teacherPermi"));
				teacher.setTeacherPw(rs.getString("teacherPw"));
				teacher.setTeacherSex(rs.getString("teacherSex"));
			}
			
		}catch(SQLException e){
			throw new PersonInfoException("");
		}
		
		
		return teacher;
	}

	
	
	
}
