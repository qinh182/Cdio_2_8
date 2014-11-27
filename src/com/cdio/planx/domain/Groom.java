/**
 * 
 */
package com.cdio.planx.domain;

import java.util.Date;

/**
 * 书影推荐表 
 * @author Administrator
 *
 */
public class Groom {

	/**推荐ID*/
	private String groomID;
	
	/**推荐标题*/
	private String groomTitle;
	
	/**推荐图片*/
	private String groomPic;
	
	
	/**推荐简介*/
	private String groomBrief;
	
	/**推荐发布人*/
	private String groomAuthor;
	
	/**推荐发布时间*/
	private Date groomDate;
	
	/**推荐类型*/
	private String groomType;

	/**
	 * @return the groomID
	 */
	public String getGroomID() {
		return groomID;
	}

	/**
	 * @param groomID the groomID to set
	 */
	public void setGroomID(String groomID) {
		this.groomID = groomID;
	}

	/**
	 * @return the groomTitle
	 */
	public String getGroomTitle() {
		return groomTitle;
	}

	/**
	 * @param groomTitle the groomTitle to set
	 */
	public void setGroomTitle(String groomTitle) {
		this.groomTitle = groomTitle;
	}

	/**
	 * @return the groomPic
	 */
	public String getGroomPic() {
		return groomPic;
	}

	/**
	 * @param groomPic the groomPic to set
	 */
	public void setGroomPic(String groomPic) {
		this.groomPic = groomPic;
	}

	/**
	 * @return the groomBrief
	 */
	public String getGroomBrief() {
		return groomBrief;
	}

	/**
	 * @param groomBrief the groomBrief to set
	 */
	public void setGroomBrief(String groomBrief) {
		this.groomBrief = groomBrief;
	}

	/**
	 * @return the groomAuthor
	 */
	public String getGroomAuthor() {
		return groomAuthor;
	}

	/**
	 * @param groomAuthor the groomAuthor to set
	 */
	public void setGroomAuthor(String groomAuthor) {
		this.groomAuthor = groomAuthor;
	}

	/**
	 * @return the groomDate
	 */
	public Date getGroomDate() {
		return groomDate;
	}

	/**
	 * @param groomDate the groomDate to set
	 */
	public void setGroomDate(Date groomDate) {
		this.groomDate = groomDate;
	}

	/**
	 * @return the groomType
	 */
	public String getGroomType() {
		return groomType;
	}

	/**
	 * @param groomType the groomType to set
	 */
	public void setGroomType(String groomType) {
		this.groomType = groomType;
	}


	
}
