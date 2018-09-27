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


/*
 * 营销机会管理
 */
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
	public List<SaleChance> list(PageFORM pageFORM,SaleChance saleChance) {
		return saleChanceService.searchByCODS(pageFORM, saleChance);
	}

	/*
	 * 新增 / 修改 销售机会
	 */
	@PostMapping("save")
	@ResponseBody
	public Map<String, Boolean> save(SaleChance saleChance) {
		Map<String, Boolean> result = new HashMap<>();

		try {			
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
