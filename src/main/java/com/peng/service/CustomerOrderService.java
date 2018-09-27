package com.peng.service;

import java.util.List;

import com.peng.entity.CustomerOrder;

public interface CustomerOrderService {
	
	
	/*
	 * 通过 多个客户 id 查找 客户订单
	 */
	List<CustomerOrder> queryByCusId(Integer cusId);
	
	
	CustomerOrder queryById(Integer id);
	
	
	/*
	 * 删除一条客户订单
	 */
	void delete(String ids);
	
	
	
	
}
