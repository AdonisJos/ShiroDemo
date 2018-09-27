package com.peng.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.CustomerLossMapper;
import com.peng.entity.CustomerLoss;
import com.peng.form.PageFORM;
import com.peng.service.CustomerLossService;

@Service
public class CustomerLossServiceImpl implements CustomerLossService{

	@Autowired
	private CustomerLossMapper customerLossMapper;
	
	@Override
	public List<CustomerLoss> queryAll(PageFORM pageFORM) {
		return customerLossMapper.queryAll();
	}

	@Override
	public List<CustomerLoss> queryByExample(PageFORM pageFORM, CustomerLoss customerLoss) {
		return customerLossMapper.queryByExample(customerLoss);
	}

	@Override
	public void saveOne(CustomerLoss customerLoss) {
		if (null!=customerLoss.getId()) {
			CustomerLoss result = customerLossMapper.queryById(customerLoss.getId());
			result.setState(1);
			result.setLossReason(customerLoss.getLossReason());
			customerLossMapper.updateOne(result);	
		}else {
			customerLossMapper.insertOne(customerLoss);
		}
	}

}
