/**
 * 
 */
package com.cdio.planx.dao;

import java.util.List;

import com.cdio.planx.domain.Competition;

/**
 * @author Administrator
 *
 */
public interface CompetitionDao {

	public List<Competition> listCompe();
	
	public int addCompe(Competition competition);
}
