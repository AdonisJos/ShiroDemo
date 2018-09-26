package com.peng.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.SaleChanceMapper;
import com.peng.entity.SaleChance;
import com.peng.form.PageFORM;
import com.peng.service.SaleChanceService;

@Service
public class SaleChanceServiceImpl implements SaleChanceService {

	@Autowired
	private SaleChanceMapper saleChanceMapper;

	/*
	 * 查询所有
	 */
	public List<SaleChance> queryAll(PageFORM pageFORM) {
		return saleChanceMapper.queryAll();
	}

	@Override
	public void saveOne(SaleChance saleChance) {
		if (null != saleChance.getId()) {
			saleChanceMapper.updateOne(saleChance);
		} else
			saleChanceMapper.insertOne(saleChance);
	}

	@Override
	public void delete(String ids) {
		List<Integer> list = new ArrayList<>();
		String[] idlist = ids.split(",");
		for (String id : idlist) {
			saleChanceMapper.deleteOne(Integer.valueOf(id));
		}

	}

	@Override
	public List<SaleChance> searchByCODS(PageFORM pageFORM, SaleChance saleChance) {
		return saleChanceMapper.searchByCODS(saleChance);
	}

}
