/**
 * 
 */
package com.cdio.planx.domain;

/**
 * 学生表
 * @author Administrator
 *
 */
public class Student {

	/**学生ID*/
	private String stuID;
	
	/**学生密码*/
	private String stuPw;
	
	/**学生姓名*/
	private String stuName;
	
	/**学生年级*/
	private String stuGrade;
	
	/**学生学院*/
	private String stuAcademy;
	
	/**学生专业*/
	private String stuMajor;
	
	/**学生班级*/
	private String stuClass;
	
	/**学生性别*/
	private String stuSex;
	
	/**学生权限*/
	private int stuPermi;
	
	/**学生联系方式*/
	private String stuCont;

	/**
	 * @return the stuID
	 */
	public String getStuID() {
		return stuID;
	}

	/**
	 * @param stuID the stuID to set
	 */
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}

	/**
	 * @return the stuPw
	 */
	public String getStuPw() {
		return stuPw;
	}

	/**
	 * @param stuPw the stuPw to set
	 */
	public void setStuPw(String stuPw) {
		this.stuPw = stuPw;
	}

	/**
	 * @return the stuName
	 */
	public String getStuName() {
		return stuName;
	}

	/**
	 * @param stuName the stuName to set
	 */
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	/**
	 * @return the stuGrade
	 */
	public String getStuGrade() {
		return stuGrade;
	}

	/**
	 * @param stuGrade the stuGrade to set
	 */
	public void setStuGrade(String stuGrade) {
		this.stuGrade = stuGrade;
	}

	/**
	 * @return the stuAcademy
	 */
	public String getStuAcademy() {
		return stuAcademy;
	}

	/**
	 * @param stuAcademy the stuAcademy to set
	 */
	public void setStuAcademy(String stuAcademy) {
		this.stuAcademy = stuAcademy;
	}

	/**
	 * @return the stuMajor
	 */
	public String getStuMajor() {
		return stuMajor;
	}

	/**
	 * @param stuMajor the stuMajor to set
	 */
	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}

	/**
	 * @return the stuClass
	 */
	public String getStuClass() {
		return stuClass;
	}

	/**
	 * @param stuClass the stuClass to set
	 */
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	/**
	 * @return the stuSex
	 */
	public String getStuSex() {
		return stuSex;
	}

	/**
	 * @param stuSex the stuSex to set
	 */
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	/**
	 * @return the stuPermi
	 */
	public int getStuPermi() {
		return stuPermi;
	}

	/**
	 * @param stuPermi the stuPermi to set
	 */
	public void setStuPermi(int stuPermi) {
		this.stuPermi = stuPermi;
	}

	/**
	 * @return the stuCont
	 */
	public String getStuCont() {
		return stuCont;
	}

	/**
	 * @param stuCont the stuCont to set
	 */
	public void setStuCont(String stuCont) {
		this.stuCont = stuCont;
	}

	public Student(String stuID, String stuPw, String stuName, String stuGrade,
			String stuAcademy, String stuMajor, String stuClass, String stuSex,
			int stuPermi, String stuCont) {
		super();
		this.stuID = stuID;
		this.stuPw = stuPw;
		this.stuName = stuName;
		this.stuGrade = stuGrade;
		this.stuAcademy = stuAcademy;
		this.stuMajor = stuMajor;
		this.stuClass = stuClass;
		this.stuSex = stuSex;
		this.stuPermi = stuPermi;
		this.stuCont = stuCont;
	}

	public Student() {
		super();
	}

	
}
