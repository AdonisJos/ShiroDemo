package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.Customer;

public interface CustomerMapper {

	/*
	 * 查询所有 客户
	 */
	List<Customer> queryAll();
}
