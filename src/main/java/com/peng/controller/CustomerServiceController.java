package com.peng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.CustomerService;
import com.peng.form.PageFORM;
import com.peng.service.CustomerServiceService;

@Controller
@RequestMapping("customerService")
public class CustomerServiceController {

	@Autowired
	private CustomerServiceService customerServiceService;

	/*
	 * 新增 / 修改 客户
	 */
	@PostMapping("save")
	@ResponseBody
	public Map<String, Boolean> save(CustomerService customerService) {
		Map<String, Boolean> result = new HashMap<>();

		try {
			customerServiceService.saveOne(customerService);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}

	@PostMapping("list")
	@ResponseBody
	public List<CustomerService> list(PageFORM pageFORM, CustomerService customerService) {
		return customerServiceService.queryByExample(pageFORM, customerService);
	}
}
