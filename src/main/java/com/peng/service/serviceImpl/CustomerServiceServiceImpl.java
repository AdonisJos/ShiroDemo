package com.peng.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.CustomerServiceMapper;
import com.peng.entity.CustomerService;
import com.peng.form.PageFORM;
import com.peng.service.CustomerServiceService;

@Service
public class CustomerServiceServiceImpl implements CustomerServiceService {

	@Autowired
	private CustomerServiceMapper customerServiceMapper;

	@Override
	public void saveOne(CustomerService customerService) {
		if (null != customerService.getId()) {
			customerServiceMapper.updateOne(customerService);
		} else {
			customerServiceMapper.insertOne(customerService);
		}

	}

	@Override
	public List<CustomerService> queryByExample(PageFORM pageFORM, CustomerService customerService) {
		return customerServiceMapper.queryByExample(customerService);
	}

}
