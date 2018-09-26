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
	 * 增加一条销售机会 更新一条销售机会
	 */
	void saveOne(SaleChance saleChance);

	/*
	 * 删除多条销售机会
	 */
	void delete(String ids);

	/*
	 * 通过 “客户名称”，“概要”，“客户开发状态”查询数据
	 */
	List<SaleChance> searchByCODS(PageFORM pageFORM, SaleChance saleChance);

}
