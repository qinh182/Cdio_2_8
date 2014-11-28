/**
 * 
 */
package com.cdio.planx.dao;

import com.cdio.planx.domain.Admin;
import com.cdio.planx.domain.HTeacher;
import com.cdio.planx.domain.Student;
import com.cdio.planx.domain.Teacher;

/**
 * @author Administrator
 *
 */
public interface UserDao {
	
	public Student findStu(String stuID,String stuPw,String stuPermi) ;
	
	public Teacher findTea(String teaID,String teaPw,String teaPermi);
	
	public HTeacher findHTea(String hTeaID,String hTeaPw,String hTeaPermi);
	
	public Admin findAdmin(String adminID,String adminPw,String adminPermi);
}
