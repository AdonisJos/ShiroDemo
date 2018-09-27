package com.peng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.CustomerLoss;
import com.peng.form.PageFORM;
import com.peng.service.CustomerLossService;
/*
 * 客户流失管理
 */

@Controller
@RequestMapping("customerLoss")
public class CustomerLossController {
	
	@Autowired
	private CustomerLossService customerLossService;
	
	@PostMapping("list")
	@ResponseBody
	public List<CustomerLoss> list(PageFORM pageFORM,CustomerLoss customerLoss) {
		return customerLossService.queryByExample(pageFORM,customerLoss);
	}
	
	@PostMapping("findById")
	@ResponseBody
	public CustomerLoss findById(PageFORM pageFORM,CustomerLoss customerLoss) {
		return customerLossService.queryByExample(pageFORM,customerLoss).get(0);
	}
	
	@PostMapping("confirmLoss")
	@ResponseBody
	public Map<String, Boolean> confirmLoss(CustomerLoss customerLoss) {
		
		Map<String, Boolean> result = new HashMap<>();

		try {			
			customerLossService.saveOne(customerLoss);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}
	
	
	
	
}
