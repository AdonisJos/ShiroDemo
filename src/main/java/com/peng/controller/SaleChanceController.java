package com.peng.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.SaleChance;
import com.peng.form.PageFORM;
import com.peng.service.SaleChanceService;

@Controller
@RequestMapping("saleChance")
public class SaleChanceController {

	@Autowired
	private SaleChanceService saleChanceService;

	/*
	 * 销售机会列表 和 销售机会搜索
	 */
	@PostMapping("list")
	@ResponseBody
	public List<SaleChance> list(@RequestParam(name = "page", required = false) Integer page,
			@RequestParam(name = "rows", required = false) Integer rows,
			@RequestParam(name = "state", required = false) Integer state,
			@RequestParam(name = "customerName", required = false) String customerName,
			@RequestParam(name = "overView", required = false) String overView,
			@RequestParam(name = "createMan", required = false) String createMan
//	  ,@RequestParam(name = "saleChance", required = false) SaleChance saleChance	// 为什么封装不了
	) {
		PageFORM pageFORM = new PageFORM(page, rows);
		if (null == state && null == customerName && null == overView && null == createMan) {
			return saleChanceService.queryAll(pageFORM);
		}
		SaleChance saleChance = new SaleChance(customerName, overView, createMan, state);
		return saleChanceService.searchByCODS(pageFORM, saleChance);
	}

	/*
	 * 新增 / 修改 销售机会
	 */
	@PostMapping("save")
	@ResponseBody
	public Map<String, Boolean> save(@RequestParam(name = "id", required = false) Integer id,
			@RequestParam(name = "customerName", required = false) String customerName,
			@RequestParam(name = "chanceSource", required = false) String chanceSource,
			@RequestParam(name = "linkMan", required = false) String linkMan,
			@RequestParam(name = "linkPhone", required = false) String linkPhone,
			@RequestParam(name = "cgjl", required = false) Integer cgjl,
			@RequestParam(name = "overView", required = false) String overView,
			@RequestParam(name = "description", required = false) String description,
			@RequestParam(name = "createMan", required = false) String createMan,
			@RequestParam(name = "createTime", required = false) Date createTime,
			@RequestParam(name = "assignMan", required = false) String assignMan,
			@RequestParam(name = "assignTime", required = false) Date assignTime) {
		Map<String, Boolean> result = new HashMap<>();

		try {
			SaleChance saleChance = new SaleChance(id, chanceSource, customerName, cgjl, overView, linkMan, linkPhone,
					description, createMan, createTime, assignMan, assignTime);
			saleChanceService.saveOne(saleChance);
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
			saleChanceService.delete(ids);
			result.put("success", true);
		} catch (Exception e) {
			result.put("success", false);
		}
		return result;
	}

}
