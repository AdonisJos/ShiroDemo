package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.CustomerService;

public interface CustomerServiceMapper {

	void insertOne(CustomerService customerService);

	void updateOne(CustomerService customerService);

	List<CustomerService> queryByExample(CustomerService customerService);

}
