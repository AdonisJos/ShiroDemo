package com.peng.service;

import java.util.List;

import com.peng.entity.Customer;

public interface CustomerService {
	/*
	 * 查询所有 客户
	 */
	List<Customer> queryAll();
	
	/*
	 * 新增 / 修改 客户
	 */
	void saveOne(Customer customer);
	
	/*
	 * 按 id 查找
	 */
	Customer queryById(Integer id);
}
