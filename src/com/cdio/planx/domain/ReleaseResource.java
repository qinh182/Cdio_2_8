/**
 * 
 */
package com.cdio.planx.domain;

/**
 * 发布人资源表
 * @author Administrator
 *
 */
public class ReleaseResource {
	
	/**资源ID*/
	private String resID;
	
	/**发布人ID*/
	private String authorID;

	/**
	 * @return the resID
	 */
	public String getResID() {
		return resID;
	}

	/**
	 * @param resID the resID to set
	 */
	public void setResID(String resID) {
		this.resID = resID;
	}

	/**
	 * @return the authorID
	 */
	public String getAuthorID() {
		return authorID;
	}

	/**
	 * @param authorID the authorID to set
	 */
	public void setAuthorID(String authorID) {
		this.authorID = authorID;
	}

	
}
