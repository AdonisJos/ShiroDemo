package com.peng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.CustomerOrder;
import com.peng.service.CustomerOrderService;

@Controller
@RequestMapping("order")
public class CustomerOrderController {

	@Autowired
	private CustomerOrderService customerOrderService;
	
	@PostMapping("list")
	@ResponseBody
	public List<CustomerOrder> list(Integer cusId) {
		return customerOrderService.queryByCusId(cusId);
	}
	
	
	@PostMapping("findById")
	@ResponseBody
	public CustomerOrder findById(Integer id) {
		return customerOrderService.queryById(id);
	}
	
	
	
}
