package com.peng.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.CustomerMapper;
import com.peng.entity.Customer;
import com.peng.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public List<Customer> queryAll() {
		return customerMapper.queryAll();
	}

	@Override
	public void saveOne(Customer customer) {
		
		if (null!=customer.getId()) {
			customerMapper.updateOne(customer);
		}else {
			customerMapper.insertOne(customer);
		}
		
	}

	@Override
	public Customer queryById(Integer id) {
		return customerMapper.queryById(id);
	}

}
