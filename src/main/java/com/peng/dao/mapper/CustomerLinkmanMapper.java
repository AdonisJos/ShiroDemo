package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.CustomerLinkman;

public interface CustomerLinkmanMapper {
	
	List<CustomerLinkman> queryByCusId(String cusId);
	
	/*
	 * 新增 客户
	 */
	void insertOne(CustomerLinkman customerLinkman);
	
	
	/*
	 * 修改 客户
	 */
	void updateOne(CustomerLinkman customerLinkman);
	
	void deleteOne(Integer id);
}
