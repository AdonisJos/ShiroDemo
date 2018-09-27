package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.OrderDetails;

public interface OrderDetailsMapper {
	
	/*
	 * 删除 一条订单详情
	 */
	void deleteOne(Integer orderId);
	
	
	
	/*
	 * 通过 多个客户 id 查找 客户订单
	 */
	List<OrderDetails> queryByOrderId(Integer orderId);
}
