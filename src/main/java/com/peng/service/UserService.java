package com.peng.service;

import java.util.List;

import com.peng.POJO.UserPOJO;
import com.peng.entity.User;

public interface UserService {

	public User queryUserByName(String userName);

	/**
	 * 通过 用户名 ， 密码 ，角色名称查找 User
	 * 
	 * @param userPOJO
	 * @return
	 */
	public User queryUserByNPR(UserPOJO userPOJO);

	/*
	 * 通过角色名称查找 用户
	 */
	public List<User> queryUserByRoleName(String roleName);

	public List<User> queryAll();

}