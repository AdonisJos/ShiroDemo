package com.peng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.SaleChance;
import com.peng.entity.User;
import com.peng.form.PageFORM;
import com.peng.service.SaleChanceService;


@Controller
@RequestMapping("saleChance")
public class SaleChanceController {
	
	@Autowired
	private SaleChanceService saleChanceService;
	
	@RequestMapping(value="list",method=RequestMethod.POST)
	@ResponseBody
	public List<SaleChance> getAll(PageFORM pageFORM,HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("currentUser");
		return saleChanceService.queryAll(pageFORM);
	}
	
	/*
	 * 新增 销售机会
	 */
	@RequestMapping(value="save",method=RequestMethod.POST)
	@ResponseBody
	public Map saveOne(SaleChance saleChance){
		
		Map<String, Boolean> result = new HashMap<>();

		try {
			saleChanceService.insertOne(saleChance);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
		
	}
	
}
