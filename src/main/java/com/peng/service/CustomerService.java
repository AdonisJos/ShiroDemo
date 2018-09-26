package com.peng.service;

import java.util.List;

import com.peng.entity.Customer;

public interface CustomerService {
	/*
	 * 查询所有 客户
	 */
	List<Customer> queryAll();
}
