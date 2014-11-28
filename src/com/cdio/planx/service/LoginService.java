/**
 * 
 */
package com.cdio.planx.service;

import com.cdio.planx.dao.UserDao;
import com.cdio.planx.dao.impl.UserDaoImpl;
import com.cdio.planx.domain.User;

/**
 * @author Administrator
 *
 */
public class LoginService {

	UserDao ud = new UserDaoImpl();
	
	public User isLogin(String userID,String userPw,String userPermi){
		
		if(userPermi.equals("0")||userPermi.equals("1"))
			return ud.findStu(userID, userPw, userPermi);
		else if(userPermi.equals("2"))
			return ud.findTea(userID, userPw, userPermi);
		else if(userPermi.equals("3"))
			return ud.findHTea(userID, userPw, userPermi);
		else if(userPermi.equals("4"))
			return ud.findAdmin(userID, userPw, userPermi);
		
		return null;
	}
}
// type 0 1 2 3 4