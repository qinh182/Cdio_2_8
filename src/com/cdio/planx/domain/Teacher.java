/**
 * 
 */
package com.cdio.planx.domain;

/**
 * 教师表
 * @author 黄钦煌
 *
 */
public class Teacher extends User {
	
	/**教师ID*/
	private String teacherID;
	
	/**教师密码*/
	private String teacherPw;
	
	/**教师姓名*/
	private String teacherName;
	
	/**教师学院*/
	private String teacherAcademy;
	
	/**教师性别*/
	private String teacherSex;
	
	/**教师权限*/
	private int teacherPermi;
	
	/**教师联系方式*/
	private String teacherCont;

	/**
	 * @return the teacherID
	 */
	public String getTeacherID() {
		return teacherID;
	}

	/**
	 * @param teacherID the teacherID to set
	 */
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	/**
	 * @return the teacherPw
	 */
	public String getTeacherPw() {
		return teacherPw;
	}

	/**
	 * @param teacherPw the teacherPw to set
	 */
	public void setTeacherPw(String teacherPw) {
		this.teacherPw = teacherPw;
	}

	/**
	 * @return the teacherName
	 */
	public String getTeacherName() {
		return teacherName;
	}

	/**
	 * @param teacherName the teacherName to set
	 */
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	/**
	 * @return the teacherAcademy
	 */
	public String getTeacherAcademy() {
		return teacherAcademy;
	}

	/**
	 * @param teacherAcademy the teacherAcademy to set
	 */
	public void setTeacherAcademy(String teacherAcademy) {
		this.teacherAcademy = teacherAcademy;
	}

	/**
	 * @return the teacherSex
	 */
	public String getTeacherSex() {
		return teacherSex;
	}

	/**
	 * @param teacherSex the teacherSex to set
	 */
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}

	/**
	 * @return the teacherPermi
	 */
	public int getTeacherPermi() {
		return teacherPermi;
	}

	/**
	 * @param teacherPermi the teacherPermi to set
	 */
	public void setTeacherPermi(int teacherPermi) {
		this.teacherPermi = teacherPermi;
	}

	/**
	 * @return the teacherCont
	 */
	public String getTeacherCont() {
		return teacherCont;
	}

	/**
	 * @param teacherCont the teacherCont to set
	 */
	public void setTeacherCont(String teacherCont) {
		this.teacherCont = teacherCont;
	}
	
	
	
}
