/**
 * 
 */
package com.cdio.planx.dao;

import java.util.List;

import com.cdio.planx.domain.Groom;

/**
 * @author Administrator
 *
 */
public interface GroomDao {

	public List<Groom> listGroom();
	
	public int addGroom(Groom groom);
	
	public int delGroom(String groomID);
	

	
}
