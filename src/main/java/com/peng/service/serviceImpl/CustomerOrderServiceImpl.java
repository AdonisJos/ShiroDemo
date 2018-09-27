package com.peng.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.CustomerOrderMapper;
import com.peng.dao.mapper.OrderDetailsMapper;
import com.peng.entity.CustomerOrder;
import com.peng.service.CustomerOrderService;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService{

	@Autowired
	private CustomerOrderMapper customerOrderMapper;
	
	@Autowired
	private OrderDetailsMapper orderDetailsMapper;
	
	@Override
	public void delete(String ids) {
		
		String[] list = ids.split(",");
		for (String id : list) {
			
		}
	}

	@Override
	public List<CustomerOrder> queryByCusId(Integer cusId) {
		return customerOrderMapper.queryByCusId(cusId);

		 
	}

	@Override
	public CustomerOrder queryById(Integer id) {
		return customerOrderMapper.queryById(id);
	}

	

	
	
}
