package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.CustomerLoss;

public interface CustomerLossMapper {

	
	/*
	 * 查询所有 流失的客户
	 */
	List<CustomerLoss> queryAll();
	
	/*
	 * 查询所有 流失的客户
	 */
	List<CustomerLoss> queryByExample(CustomerLoss customerLoss);
	
	/*
	 * 查询所有 流失的客户
	 */
	CustomerLoss queryById(Integer id);
	
	/*
	 * 增加一条销售机会
	 */
	void insertOne(CustomerLoss customerLoss);

	/*
	 * 更新一条销售机会
	 */
	void updateOne(CustomerLoss customerLoss);
}
