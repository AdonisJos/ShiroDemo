package com.peng.POJO;

public class UserPOJO {

	/** 用户名  */
	private String userName;
	/** 密码 */
	private String password;
	/** 角色名称 */
	private String roleName;
	
	public UserPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserPOJO(String userName, String password, String roleName) {
		super();
		this.userName = userName;
		this.password = password;
		this.roleName = roleName;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "UserFORM [userName=" + userName + ", password=" + password + ", roleName=" + roleName + "]";
	}
	
	
	
	
}
