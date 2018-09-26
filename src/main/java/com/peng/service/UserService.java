package com.peng.service;

import java.util.List;
import java.util.Set;

import com.peng.POJO.UserPOJO;
import com.peng.entity.User;

public interface UserService {

    public User queryUserByName(String userName);
    
    
    /**
     * 通过 用户名 ， 密码 ，角色名称查找 User
     * @param userPOJO
     * @return
     */
    public User queryUserByNPR(UserPOJO userPOJO);
    
    public Set<String> queryRolesByName(String userName);
    
    public List<User> queryAll();
    
}