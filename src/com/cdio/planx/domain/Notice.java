/**
 * 
 */
package com.cdio.planx.domain;

import java.util.Date;


/**
 * 通知表
 * @author Administrator
 *
 */
public class Notice {
	
	/**通知ID*/
	private String noticeID;
	
	/**通知内容*/
	private String noticeContent;
	
	/**通知时间*/
	private Date noticeDate;
	
	/**通知作者*/
	private String noticeAuthor;
	
	/**通知作者权限*/
	private int noticePermi;
	
	/**通知学院*/
	private String noticeAcademy;
	
	/**通知班级*/
	private String noticeClass;
	
	/**通知年级*/
	private String noticeGrade;

	/**
	 * @return the noticeID
	 */
	public String getNoticeID() {
		return noticeID;
	}

	/**
	 * @return the noticeAcademy
	 */
	public String getNoticeAcademy() {
		return noticeAcademy;
	}

	/**
	 * @param noticeAcademy the noticeAcademy to set
	 */
	public void setNoticeAcademy(String noticeAcademy) {
		this.noticeAcademy = noticeAcademy;
	}

	/**
	 * @return the noticeClass
	 */
	public String getNoticeClass() {
		return noticeClass;
	}

	/**
	 * @param noticeClass the noticeClass to set
	 */
	public void setNoticeClass(String noticeClass) {
		this.noticeClass = noticeClass;
	}

	/**
	 * @return the noticeGrade
	 */
	public String getNoticeGrade() {
		return noticeGrade;
	}

	/**
	 * @param noticeGrade the noticeGrade to set
	 */
	public void setNoticeGrade(String noticeGrade) {
		this.noticeGrade = noticeGrade;
	}

	/**
	 * @param noticeID the noticeID to set
	 */
	public void setNoticeID(String noticeID) {
		this.noticeID = noticeID;
	}

	/**
	 * @return the noticeContent
	 */
	public String getNoticeContent() {
		return noticeContent;
	}

	/**
	 * @param noticeContent the noticeContent to set
	 */
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	/**
	 * @return the noticeDate
	 */
	public Date getNoticeDate() {
		return noticeDate;
	}

	/**
	 * @param noticeDate the noticeDate to set
	 */
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	/**
	 * @return the noticeAuthor
	 */
	public String getNoticeAuthor() {
		return noticeAuthor;
	}

	/**
	 * @param noticeAuthor the noticeAuthor to set
	 */
	public void setNoticeAuthor(String noticeAuthor) {
		this.noticeAuthor = noticeAuthor;
	}

	/**
	 * @return the noticePermi
	 */
	public int getNoticePermi() {
		return noticePermi;
	}

	/**
	 * @param noticePermi the noticePermi to set
	 */
	public void setNoticePermi(int noticePermi) {
		this.noticePermi = noticePermi;
	}

	public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
