package com.peng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.Customer;
import com.peng.form.PageFORM;
import com.peng.service.CustomerService;

/*
 * 客户信息管理
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("list")
	@ResponseBody
	public List<Customer> list() {
		return customerService.queryAll();
	}

	/*
	 * 新增 / 修改 客户
	 */
	@PostMapping("save")
	@ResponseBody
	public Map<String, Boolean> save(Customer customer) {
		Map<String, Boolean> result = new HashMap<>();

		try {
			customerService.saveOne(customer);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}

	@PostMapping("findById")
	@ResponseBody
	public Customer findById(Integer id) {
		return customerService.queryById(id);
	}

	/*
	 * 客户贡献分析
	 */
	@PostMapping("findCustomerGx")
	@ResponseBody
	public Customer findCustomerGx(PageFORM pageFORM) {
		return null;
	}

}
