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
import com.peng.entity.CustomerLinkman;
import com.peng.service.CustomerLinkmanService;

@Controller
@RequestMapping("linkMan")
public class CustomerLinkmanController {

	
	@Autowired
	private CustomerLinkmanService customerLinkmanService;
	
	@PostMapping("list")
	@ResponseBody
	public List<CustomerLinkman> list(String cusId) {
		return customerLinkmanService.queryByCusId(cusId);
	}
	
	/*
	 * 新增 / 修改 客户
	 */
	@PostMapping("save")
	@ResponseBody
	public Map<String, Boolean> save(CustomerLinkman customerLinkman,String isNewRecord) {
		Map<String, Boolean> result = new HashMap<>();

		try {			
			customerLinkmanService.saveOne(customerLinkman);
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
			customerLinkmanService.delete(ids);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}
	
}
