package com.peng.dao.mapper;

import java.util.List;

import com.peng.POJO.UserPOJO;
import com.peng.entity.User;

public interface UserMapper {
	public User queryUserByName(String userName);

	public List<User> queryUserByRoleName(String roleName);

	public User queryUserByNPR(UserPOJO userPOJO);

	public List<User> queryAll();
}