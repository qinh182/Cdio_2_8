/**
 * 
 */
package com.cdio.planx.dao;

import java.util.List;

import com.cdio.planx.domain.Notice;

/**
 * @author Administrator
 *
 */
public interface NoticeDao {

	public List<Notice> listNotice(String noticeAcademy);
	
	public int addNotice(Notice notice);
	
	
}
