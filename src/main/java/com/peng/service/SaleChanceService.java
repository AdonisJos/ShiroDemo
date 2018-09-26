package com.peng.service;

import java.util.List;

import com.peng.entity.SaleChance;
import com.peng.form.PageFORM;

public interface SaleChanceService {
	/*
	 * 查询所有
	 */
	List<SaleChance> queryAll(PageFORM pageFORM);
	
	/*
	 * 增加一条销售机会
	 */
	Integer insertOne(SaleChance saleChance);
}
