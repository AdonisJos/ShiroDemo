package com.peng.service;

import java.util.List;
import com.peng.entity.CustomerLoss;
import com.peng.form.PageFORM;

public interface CustomerLossService {

	
	/*
	 * 查询所有 流失的客户
	 */
	List<CustomerLoss> queryAll(PageFORM pageFORM);
	
	
	/*
	 * 查询所有 流失的客户
	 */
	List<CustomerLoss> queryByExample(PageFORM pageFORM,CustomerLoss customerLoss);
	
	
	/*
	 * 增加 / 修改 
	 */
	void saveOne(CustomerLoss customerLoss);
}
