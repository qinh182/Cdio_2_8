/**
 * 
 */
package com.cdio.planx.domain;

/**
 * 管理员
 * @author 黄钦煌 2014-11-25
 *
 */
public class Admin {
	
	/**管理员ID*/
	private String adminID;
	
	/**管理员密码*/
	private String adminPw;
	
	/**管理员姓名*/
	private String adminName;
	
	/**管理员权限*/
	private int adminPermi;

	/**
	 * @return the adminID
	 */
	public String getAdminID() {
		return adminID;
	}

	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}

	/**
	 * @return the adminPw
	 */
	public String getAdminPw() {
		return adminPw;
	}

	/**
	 * @param adminPw the adminPw to set
	 */
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * @return the adminPermi
	 */
	public int getAdminPermi() {
		return adminPermi;
	}

	/**
	 * @param adminPermi the adminPermi to set
	 */
	public void setAdminPermi(int adminPermi) {
		this.adminPermi = adminPermi;
	}
	
	
	
	
}
