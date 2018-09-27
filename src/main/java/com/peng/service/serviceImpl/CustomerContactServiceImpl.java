package com.peng.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.CustomerContactMapper;
import com.peng.dao.mapper.CustomerLinkmanMapper;
import com.peng.entity.CustomerContact;
import com.peng.entity.CustomerLinkman;
import com.peng.service.CustomerContactService;

@Service
public class CustomerContactServiceImpl implements CustomerContactService{
	
	@Autowired
	private CustomerContactMapper customerContactMapper;
	
	@Override
	public List<CustomerContact> queryByCusId(String cusId) {
		
		return customerContactMapper.queryByCusId(cusId);		 
	}

	@Override
	public void saveOne(CustomerContact customerContact) {
		
		if (null!=customerContact.getId()) {
			customerContactMapper.updateOne(customerContact);
		}else {
			customerContactMapper.insertOne(customerContact);
		}	
	}
	
	@Override
	public void delete(String ids) {
		List<Integer> list = new ArrayList<>();
		String[] idlist = ids.split(",");
		for (String id : idlist) {
			customerContactMapper.deleteOne(Integer.valueOf(id));
		}

	}
	
}
