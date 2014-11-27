/**
 * 
 */
package com.cdio.planx.domain;

import java.util.Date;

/**
 * 资源表
 * @author Administrator
 *
 */
public class Resource {

	/**资源ID*/
	private String resID;
	
	/**资源名称*/
	private String resName;
	
	/**资源类型*/
	private String resType;
	
	/**资源发布时间*/
	private Date resDate;
	
	/**资源发布人*/
	private String resAuthor;
	
	/**资源描述*/
	private String resDescribe;
	
	/**资源附件*/
	private String resFile;

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
	 * @return the resName
	 */
	public String getResName() {
		return resName;
	}

	/**
	 * @param resName the resName to set
	 */
	public void setResName(String resName) {
		this.resName = resName;
	}

	/**
	 * @return the resType
	 */
	public String getResType() {
		return resType;
	}

	/**
	 * @param resType the resType to set
	 */
	public void setResType(String resType) {
		this.resType = resType;
	}

	/**
	 * @return the resDate
	 */
	public Date getResDate() {
		return resDate;
	}

	/**
	 * @param resDate the resDate to set
	 */
	public void setResDate(Date resDate) {
		this.resDate = resDate;
	}

	/**
	 * @return the resAuthor
	 */
	public String getResAuthor() {
		return resAuthor;
	}

	/**
	 * @param resAuthor the resAuthor to set
	 */
	public void setResAuthor(String resAuthor) {
		this.resAuthor = resAuthor;
	}

	/**
	 * @return the resDescribe
	 */
	public String getResDescribe() {
		return resDescribe;
	}

	/**
	 * @param resDescribe the resDescribe to set
	 */
	public void setResDescribe(String resDescribe) {
		this.resDescribe = resDescribe;
	}

	/**
	 * @return the resFile
	 */
	public String getResFile() {
		return resFile;
	}

	/**
	 * @param resFile the resFile to set
	 */
	public void setResFile(String resFile) {
		this.resFile = resFile;
	}


}
