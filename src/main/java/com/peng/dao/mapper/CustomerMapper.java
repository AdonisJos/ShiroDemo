package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.Customer;

public interface CustomerMapper {

	/*
	 * 查询所有 客户
	 */
	List<Customer> queryAll();
	
	
	/*
	 * 新增 客户
	 */
	void insertOne(Customer customer);
	
	
	/*
	 * 修改 客户
	 */
	void updateOne(Customer customer);
	
	/*
	 * 按 id 查找
	 */
	Customer queryById(Integer id);
}
