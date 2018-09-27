package com.peng.service;

import java.util.List;

import com.peng.entity.CustomerOrder;
import com.peng.entity.OrderDetails;

public interface OrderDetailsService {

	/*
	 * 通过 多个客户 id 查找 客户订单
	 */
	List<OrderDetails> queryByOrderId(Integer orderId);
	
}
