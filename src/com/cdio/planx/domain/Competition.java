/**
 * 
 */
package com.cdio.planx.domain;

import java.util.Date;

/**
 * 比赛咨询表 封装比赛咨询数据
 * @author 黄钦煌 2014-11-25
 *
 */
public class Competition {
	
	/**比赛ID*/
	private String competitionID;
	
	/**比赛标题*/
	private String competitionTitle;
	
	/**比赛内容*/
	private String competitionContent;
	
	/**比赛作者*/
	private String competitionAuthor;
	
	/**比赛发布时间*/
	private Date competitionDate;
	
	/**比赛附件*/
	private String competitionFile;

	/**
	 * @return the competitionID
	 */
	public String getCompetitionID() {
		return competitionID;
	}

	/**
	 * @param competitionID the competitionID to set
	 */
	public void setCompetitionID(String competitionID) {
		this.competitionID = competitionID;
	}

	/**
	 * @return the competitionTitle
	 */
	public String getCompetitionTitle() {
		return competitionTitle;
	}

	/**
	 * @param competitionTitle the competitionTitle to set
	 */
	public void setCompetitionTitle(String competitionTitle) {
		this.competitionTitle = competitionTitle;
	}

	/**
	 * @return the competitionContent
	 */
	public String getCompetitionContent() {
		return competitionContent;
	}

	/**
	 * @param competitionContent the competitionContent to set
	 */
	public void setCompetitionContent(String competitionContent) {
		this.competitionContent = competitionContent;
	}

	/**
	 * @return the competitionAuthor
	 */
	public String getCompetitionAuthor() {
		return competitionAuthor;
	}

	/**
	 * @param competitionAuthor the competitionAuthor to set
	 */
	public void setCompetitionAuthor(String competitionAuthor) {
		this.competitionAuthor = competitionAuthor;
	}

	/**
	 * @return the competitionDate
	 */
	public Date getCompetitionDate() {
		return competitionDate;
	}

	/**
	 * @param competitionDate the competitionDate to set
	 */
	public void setCompetitionDate(Date competitionDate) {
		this.competitionDate = competitionDate;
	}

	/**
	 * @return the competitionFile
	 */
	public String getCompetitionFile() {
		return competitionFile;
	}

	/**
	 * @param competitionFile the competitionFile to set
	 */
	public void setCompetitionFile(String competitionFile) {
		this.competitionFile = competitionFile;
	}


}