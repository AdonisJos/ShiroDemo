package com.peng.service;

import java.util.List;

import com.peng.entity.CustomerContact;

public interface CustomerContactService {
	
	List<CustomerContact> queryByCusId(String cusId);
	
	/*
	 * 增加 / 修改 
	 */
	void saveOne(CustomerContact customerContact);
	
	
	
	void delete(String ids);
	
}
