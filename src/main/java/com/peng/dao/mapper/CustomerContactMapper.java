package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.CustomerContact;

public interface CustomerContactMapper {

	
	List<CustomerContact> queryByCusId(String cusId);
	
	/*
	 * 新增 客户
	 */
	void insertOne(CustomerContact customerContact);
	
	
	/*
	 * 修改 客户
	 */
	void updateOne(CustomerContact customerContact);
	
	void deleteOne(Integer id);
}
