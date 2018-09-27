package com.peng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.OrderDetails;
import com.peng.form.PageFORM;
import com.peng.service.OrderDetailsService;


@Controller
@RequestMapping("orderDetails")
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@PostMapping("list")
	@ResponseBody
	public List<OrderDetails> list(Integer orderId,PageFORM pageFORM) {
		return orderDetailsService.queryByOrderId(orderId);
	}
	
	@PostMapping("getTotalPrice")
	@ResponseBody
	public Map<String, String> getTotalPrice(Integer orderId) {
		
		List<OrderDetails> list = orderDetailsService.queryByOrderId(orderId);
		
		float totalMoney = 0;
		for (OrderDetails orderDetails : list) {
			totalMoney += orderDetails.getSum();
		}
		Map<String, String> result = new HashMap<>();
		result.put("totalMoney", String.valueOf(totalMoney));
		return result;
	}
	
	
}
