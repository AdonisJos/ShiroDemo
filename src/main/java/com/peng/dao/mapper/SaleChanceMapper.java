package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.SaleChance;

public interface SaleChanceMapper {
	
	/*
	 * 查询所有
	 */
	List<SaleChance> queryAll();
	
	
	/*
	 * 增加一条销售机会
	 */
	Integer insertOne(SaleChance saleChance);
}
