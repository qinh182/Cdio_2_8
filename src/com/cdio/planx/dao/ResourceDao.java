/**
 * 
 */
package com.cdio.planx.dao;

import java.util.List;

import com.cdio.planx.domain.Resource;

/**
 * @author Administrator
 *
 */
public interface ResourceDao {
	
	public List<Resource> listRes();

	public int addRes(Resource res);
	
	public int delRes(Resource resID);
	
	public int downRes(Resource resID);
}
