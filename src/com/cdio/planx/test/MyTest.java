package com.cdio.planx.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cdio.planx.dao.StudentDao;
import com.cdio.planx.dao.impl.StudentDaoImpl;
import com.cdio.planx.domain.Student;

public class MyTest {

	@Test
	public void testStudentDao() {
		Student stu = new Student("123012012169","123456","薛飞","2012","软件学院","软件工程","四班","男",0,"18060613142");
		StudentDao sd= new StudentDaoImpl();
		
	//	if(sd.addStu(stu)==1)
	//		System.out.println("添加成功！");
	//	if(sd.deleteStu("123012012169")==1)
	//		System.out.println("删除成功！");
	//	Student stu1 = sd.searchStu("123012012169");
	//	System.out.println(stu1.getStuAcademy());
	//	Student stu1=sd.listStu().get(0);
		//System.out.println(stu1.getStuAcademy());
	//	sd.updateStuPw("123012012169", "123456");
	//	int i =sd.updateStuInfo(stu);
		//System.out.println(i);
	}
	

}
