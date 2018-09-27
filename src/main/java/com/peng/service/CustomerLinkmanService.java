package com.peng.service;

import java.util.List;

import com.peng.entity.CustomerLinkman;

public interface CustomerLinkmanService {

	List<CustomerLinkman> queryByCusId(String cusId);
	
	/*
	 * 增加 / 修改 
	 */
	void saveOne(CustomerLinkman customerLinkman);
	
	void delete(String ids);
}
