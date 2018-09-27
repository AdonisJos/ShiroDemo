package com.peng.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.OrderDetailsMapper;
import com.peng.entity.OrderDetails;
import com.peng.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Autowired
	private OrderDetailsMapper orderDetailsMapper;
	
	@Override
	public List<OrderDetails> queryByOrderId(Integer orderId) {
		return orderDetailsMapper.queryByOrderId(orderId);
	}

}
