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
	void insertOne(SaleChance saleChance);

	/*
	 * 更新一条销售机会
	 */
	void updateOne(SaleChance saleChance);

	/*
	 * 删除一条销售机会
	 */
	void deleteOne(Integer ids);

	/*
	 * 通过 “客户名称”，“概要”，“客户开发状态”查询数据
	 */
	List<SaleChance> searchByCODS(SaleChance saleChance);
}
