/**
 * 
 */
package com.cdio.planx.dao;

import java.util.List;

import com.cdio.planx.domain.Teacher;

/**
 * @author Administrator
 *
 */
public interface TeacherDao {

	public List<Teacher> listTeacher();
	public int addTeacher(Teacher teacher);
	public int deleteTeacher(String teacherID);
	public int updateTeacherInfo(Teacher teacher);
	public int updateTeacherPw(String teacherID,String teacherPw);
	public Teacher searchTeacher(String teacherID);
	
}
