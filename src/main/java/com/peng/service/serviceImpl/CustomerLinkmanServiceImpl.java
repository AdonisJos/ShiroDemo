package com.peng.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.CustomerLinkmanMapper;
import com.peng.entity.Customer;
import com.peng.entity.CustomerLinkman;
import com.peng.service.CustomerLinkmanService;

@Service
public class CustomerLinkmanServiceImpl implements CustomerLinkmanService{

	@Autowired
	private CustomerLinkmanMapper customerLinkmanMapper;
	
	@Override
	public List<CustomerLinkman> queryByCusId(String cusId) {
		
		return customerLinkmanMapper.queryByCusId(cusId);		 
	}

	@Override
	public void saveOne(CustomerLinkman customerLinkman) {
		
		if (null!=customerLinkman.getId()) {
			customerLinkmanMapper.updateOne(customerLinkman);
		}else {
			customerLinkmanMapper.insertOne(customerLinkman);
		}	
	}

	@Override
	public void delete(String ids) {
		List<Integer> list = new ArrayList<>();
		String[] idlist = ids.split(",");
		for (String id : idlist) {
			customerLinkmanMapper.deleteOne(Integer.valueOf(id));
		}

	}
	
}
