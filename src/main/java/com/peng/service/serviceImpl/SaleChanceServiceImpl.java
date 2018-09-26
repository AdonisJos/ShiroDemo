package com.peng.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.SaleChanceMapper;
import com.peng.entity.SaleChance;
import com.peng.form.PageFORM;
import com.peng.service.SaleChanceService;

@Service
public class SaleChanceServiceImpl implements SaleChanceService{
	
	@Autowired
	private SaleChanceMapper saleChanceMapper;
	
	/*
	 * 查询所有
	 */
	public List<SaleChance> queryAll(PageFORM pageFORM){	
		return saleChanceMapper.queryAll();
	}

	@Override
	public Integer insertOne(SaleChance saleChance) {
		return saleChanceMapper.insertOne(saleChance);
	}
	
}
