package com.peng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.CustomerContact;
import com.peng.service.CustomerContactService;

@Controller
@RequestMapping("contact")
public class CustomerContactController {
	
	@Autowired
	private CustomerContactService customerContactService;
	
	@PostMapping("list")
	@ResponseBody
	public List<CustomerContact> list(String cusId) {
		return customerContactService.queryByCusId(cusId);
	}
	
	/*
	 * 新增 / 修改 客户交往记录
	 */
	@PostMapping("save")
	@ResponseBody
	public Map<String, Boolean> save(CustomerContact customerContact,String isNewRecord) {
		Map<String, Boolean> result = new HashMap<>();

		try {			
			customerContactService.saveOne(customerContact);
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
	public Map<String, Boolean> delete(String ids) {
		Map<String, Boolean> result = new HashMap<>();
		try {
			customerContactService.delete(ids);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}
	
}
