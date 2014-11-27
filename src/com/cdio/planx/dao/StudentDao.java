/**
 * 
 */
package com.cdio.planx.dao;

import java.util.List;

import com.cdio.planx.domain.Student;

/**
 * 
 * @author Administrator
 *
 */
public interface StudentDao {

	/**
	 * 学生信息列表，获取所有学生信息 ，只有管理员才能调用
	 * @return 所有学生信息 
	 */
	public List<Student> listStu();
	
	/**
	 * 添加学生，添加学生信息，只有管理员才能调用
	 * @param stu 添加的学生信息
	 * @return 返回1为添加成功，0则为失败
	 */
	public int addStu(Student stu); 
	
	/**
	 * 删除学生信息，只有管理员才能调用
	 * @param stu 删除的学生ID
	 * @return 返回1为添加成功，0则为失败
	 */
	public int deleteStu(String stuID); 
	
	/**
	 * 更新学生信息，管理员和学生本人才能调用
	 * @param stu 更新的学生信息
	 * @return 返回1为添加成功，0则为失败
	 */
	public int updateStuInfo(Student stu); 
	
	/**
	 * 修改学生密码，管理员和学生本人才能调用
	 * @param stuID 学生ID
	 * @param stuPw 学生密码
	 * @return 返回1为添加成功，0则为失败
	 */
	public int updateStuPw(String stuID,String stuPw); 
	
	/**
	 * 查找学生信息，只有管理员才能调用
	 * @param stuID 学生ID
	 * @return 返回查找到的学生信息
	 */
	public Student searchStu(String stuID); 
	
}
