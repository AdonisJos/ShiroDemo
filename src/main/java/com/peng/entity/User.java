package com.peng.entity;

public class User {
	
	/** 编号*/
	private Integer id;
	/** 用户名  */
	private String userName;
	/** 密码 */
	private String password;
	/** 真实姓名 */
	private String trueName;
	/** 邮箱 */
	private String email;
	/** 联系电话 */
	private String phone;
	/** 角色名称 */
	private String roleName;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String userName, String password, String trueName, String email, String phone,
			String roleName) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.trueName = trueName;
		this.email = email;
		this.phone = phone;
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
	
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTrueName() {
		return trueName;
	}


	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", trueName=" + trueName
				+ ", email=" + email + ", phone=" + phone + ", roleName=" + roleName + "]";
	}
	
	
	
	
}
