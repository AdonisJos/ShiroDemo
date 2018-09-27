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
import com.peng.entity.CustomerReprieve;
import com.peng.form.PageFORM;
import com.peng.service.CustomerReprieveService;

@Controller
@RequestMapping("customerReprieve")
public class CustomerReprieveController {

	@Autowired
	private CustomerReprieveService customerReprieveService;
	
	@PostMapping("list")
	@ResponseBody
	public List<CustomerReprieve> list(PageFORM pageFORM,CustomerReprieve customerReprieve) {
		return customerReprieveService.queryByExample(pageFORM,customerReprieve);
	}
	
	
	/*
	 * 新增 / 修改 客户流失
	 */
	@PostMapping("save")
	@ResponseBody
	public Map<String, Boolean> save(CustomerReprieve customerReprieve) {
		Map<String, Boolean> result = new HashMap<>();

		try {			
			customerReprieveService.saveOne(customerReprieve);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}
	
	/*
	 * 删除 1-多条 销售机会
	 */
	@PostMapping("delete")
	@ResponseBody
	public Map<String, Boolean> delete(String id) {
		Map<String, Boolean> result = new HashMap<>();
		try {
			customerReprieveService.delete(id);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}
	
}
