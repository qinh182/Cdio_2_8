/**
 * 
 */
package com.cdio.planx.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cdio.planx.dao.UserDao;
import com.cdio.planx.domain.Admin;
import com.cdio.planx.domain.HTeacher;
import com.cdio.planx.domain.Student;
import com.cdio.planx.domain.Teacher;
import com.cdio.planx.exception.PersonInfoException;
import com.cdio.planx.utils.DbConn;

/**
 * @author Administrator
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public Student findStu(String stuID, String stuPw, String stuPermi) {
		Student stu=null;
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from Student where stuID=? and stuPw=? and stuPermi=?";
		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, stuID);
			ps.setString(2, stuPw);
			ps.setInt(3, Integer.parseInt(stuPermi));
			rs = ps.executeQuery();
			while(rs.next()){
				stu=new Student();
				stu.setStuAcademy(rs.getString("stuAcademy"));
				stu.setStuClass(rs.getString("stuClass"));
				stu.setStuCont(rs.getString("stuCont"));
				stu.setStuGrade(rs.getString("stuGrade"));
				stu.setStuID(rs.getString("stuID"));
				stu.setStuMajor(rs.getString("stuMajor"));
				stu.setStuName(rs.getString("stuName"));
				stu.setStuPermi(rs.getInt("stuPermi"));
				stu.setStuPw(rs.getString("stuPw"));
				stu.setStuSex(rs.getString("stuSex"));
			}	
			
		}catch(SQLException e){
			throw new PersonInfoException("");
			
		}
		
		
		
		return stu;
	}

	@Override
	public Teacher findTea(String teaID, String teaPw, String teaPermi) {
		Teacher tea = null;
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from Teacher where teacherID=? and teacherPw=? and teacherPermi=?";
		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, teaID);
			ps.setString(2, teaPw);
			ps.setInt(3, Integer.parseInt(teaPermi));
			rs = ps.executeQuery();
			while(rs.next()){
				tea=new Teacher();
				tea.setTeacherAcademy(rs.getString("teacherAcademy"));
				tea.setTeacherCont(rs.getString("teacherCont"));
				tea.setTeacherID(rs.getString("teacherID"));
				tea.setTeacherName(rs.getString("teacherName"));
				tea.setTeacherPermi(rs.getInt("teacherPermi"));
				tea.setTeacherPw(rs.getString("teacherPw"));
				tea.setTeacherSex(rs.getString("teacherSex"));
			}	
		}catch(SQLException e){
			throw new PersonInfoException("");
		}
		return tea;
	}

	@Override
	public HTeacher findHTea(String hTeaID, String hTeaPw, String hTeaPermi) {
		HTeacher hTea = null;
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from HTeacher where hTeacherID=? and hTeacherPw=? and hTeacherPermi=?";
		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, hTeaID);
			ps.setString(2, hTeaPw);
			ps.setInt(3, Integer.parseInt(hTeaPermi));
			rs = ps.executeQuery();
			while(rs.next()){
				hTea=new HTeacher();
				hTea.sethTeacherAcademy(rs.getString("hTeacherAcademy"));
				hTea.sethTeacherCont(rs.getString("hTeacherCont"));
				hTea.sethTeacherID(rs.getString("hTeacherID"));
				hTea.sethTeacherName(rs.getString("hTeacherName"));
				hTea.sethTeacherPermi(rs.getInt("hTeacherPermi"));
				hTea.sethTeacherPw(rs.getString("hTeacherPw"));
				hTea.sethTeacherSex(rs.getString("hTeacherSex"));
			}	
		}catch(SQLException e){
			throw new PersonInfoException("");
		}
		
		return hTea;
	}

	@Override
	public Admin findAdmin(String adminID, String adminPw, String adminPermi) {
		Admin admin=null;
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from Admin where adminID=? and adminPw=? and adminPermi=?";
		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, adminID);
			ps.setString(2, adminPw);
			ps.setInt(3, Integer.parseInt(adminPermi));
			rs = ps.executeQuery();
			while(rs.next()){
				admin=new Admin();
				admin.setAdminID(rs.getString("adminID"));
				admin.setAdminName(rs.getString("adminName"));
				admin.setAdminPw(rs.getString("adminPw"));
				admin.setAdminPermi(rs.getInt("adminPermi"));
			}	
		}catch(SQLException e){
			throw new PersonInfoException("");
		}
		return admin;
	}

	
}
