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

import com.cdio.planx.dao.StudentDao;
import com.cdio.planx.domain.Student;
import com.cdio.planx.exception.CdioException;
import com.cdio.planx.exception.PersonInfoException;
import com.cdio.planx.utils.DbConn;

/**
 * @author Administrator
 *
 */
public class StudentDaoImpl implements StudentDao {

	@Override
	public List<Student> listStu() {
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs=null;
		List<Student> listStudents=new ArrayList<Student>();
		String sql = "select * from Student";
		try {
			conn=DbConn.getConn();
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				Student stu = new Student();
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
				listStudents.add(stu);
			}
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		
		return listStudents;
		
	}

	@Override
	public int addStu(Student stu) {
		Connection conn = null;
		PreparedStatement ps=null;
		int i=0;
		String sql="insert into Student(stuID,stuPw,stuName,stuMajor,stuClass,stuSex,stuPermi,stuCont,stuAcademy,stuGrade)values(?,?,?,?,?,?,?,?,?,?)";
		
		try {
			conn=DbConn.getConn();
			ps=conn.prepareStatement(sql);
			ps.setString(1,stu.getStuID());
			ps.setString(2,stu.getStuPw());
			ps.setString(3,stu.getStuName());
			ps.setString(4,stu.getStuMajor());
			ps.setString(5,stu.getStuClass());
			ps.setString(6,stu.getStuSex());
			ps.setInt(7,stu.getStuPermi());
			ps.setString(8,stu.getStuCont());
			ps.setString(9,stu.getStuAcademy());
			ps.setString(10,stu.getStuGrade());
			i=ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		return i;
	}

	@Override
	public int deleteStu(String stuID) {
		Connection conn = null;
		Statement stmt=null;
		int i=0;
		String sql="delete from Student where stuID="+stuID;
		
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
	public int updateStuInfo(Student stu) {
		int i=0;
		Connection conn = null;
		PreparedStatement ps=null;
		String sql="update Student set stuName=?,stuMajor=?,stuClass=?,stuSex=?,stuPermi=?,stuCont=?,stuAcademy=?,stuGrade=? where stuID="+stu.getStuID();
		
		try {
			conn=DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,stu.getStuName());
			ps.setString(2,stu.getStuMajor());
			ps.setString(3,stu.getStuClass());
			ps.setString(4,stu.getStuSex());
			ps.setInt(5,stu.getStuPermi());
			ps.setString(6,stu.getStuCont());
			ps.setString(7,stu.getStuAcademy());
			ps.setString(8,stu.getStuGrade());
			i=ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		
		return i;
	}

	@Override
	public int updateStuPw(String stuID, String stuPw) {
		int i=0;
		Connection conn = null;
		PreparedStatement ps=null;
		String sql="update Student set stuPw=?where stuID="+stuID;
		try {
			conn=DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1,stuPw);
			i=ps.executeUpdate();
		} catch (SQLException e) {
			throw new PersonInfoException("");
		}
		return i;
	}
	
	@Override
	public Student searchStu(String stuID) {
		Student stu=null;
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="select * from Student where stuID=?";
		try {
			conn = DbConn.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, stuID);
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

}
