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
	
	/**通知作者*/
	private String noticePermi;

	/**
	 * @return the noticeID
	 */
	public String getNoticeID() {
		return noticeID;
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
	public String getNoticePermi() {
		return noticePermi;
	}

	/**
	 * @param noticePermi the noticePermi to set
	 */
	public void setNoticePermi(String noticePermi) {
		this.noticePermi = noticePermi;
	}

	

}
