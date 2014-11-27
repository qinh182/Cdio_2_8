/**
 * 
 */
package com.cdio.planx.domain;

/**
 * 发布人通知表
 * @author Administrator
 *
 */
public class ReleaseNotice {

	/**发布人ID*/
	private String releaseID;
	
	/**通知ID*/
	private String noticeID;

	/**
	 * @return the releaseID
	 */
	public String getReleaseID() {
		return releaseID;
	}

	/**
	 * @param releaseID the releaseID to set
	 */
	public void setReleaseID(String releaseID) {
		this.releaseID = releaseID;
	}

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
	
	
	
}
