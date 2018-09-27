package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.CustomerOrder;

public interface CustomerOrderMapper {

	/*
	 * 删除一条客户订单
	 */
	void deleteOne(Integer id);

	List<CustomerOrder> queryByCusId(Integer cusId);
	
	CustomerOrder queryById(Integer id);
}
