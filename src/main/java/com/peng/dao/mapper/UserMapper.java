package com.peng.dao.mapper;

import java.util.List;
import java.util.Set;

import com.peng.POJO.UserPOJO;
import com.peng.entity.User;

public interface UserMapper {
    public User queryUserByName(String userName);
    public Set<String> queryRolesByName(String userName);
    public User queryUserByNPR(UserPOJO userPOJO);
    
    public List<User> queryAll();
}