package com.peng.service.serviceImpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.POJO.UserPOJO;
import com.peng.dao.mapper.UserMapper;
import com.peng.entity.User;
import com.peng.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User queryUserByName(String userName){
        return userMapper.queryUserByName(userName);
    }
    public Set<String> queryRolesByName(String userName){
        return userMapper.queryRolesByName(userName);
    }
    
    public List<User> queryAll(){
    	return userMapper.queryAll();
    }

	public User queryUserByNPR(UserPOJO userPOJO) {
		return userMapper.queryUserByNPR(userPOJO);
	}
    
}