package com.peng.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.CustomerReprieveMapper;
import com.peng.entity.CustomerReprieve;
import com.peng.form.PageFORM;
import com.peng.service.CustomerReprieveService;

@Service
public class CustomerReprieveServiceImpl implements CustomerReprieveService{

	@Autowired
	private CustomerReprieveMapper customerReprieveMapper;
	
	@Override
	public List<CustomerReprieve> queryByExample(PageFORM pageFORM,CustomerReprieve customerReprieve) {
		return customerReprieveMapper.queryByExample(customerReprieve);
	}

	@Override
	public void saveOne(CustomerReprieve customerReprieve) {
		
		if (null!=customerReprieve.getId()) {
			customerReprieveMapper.updateOne(customerReprieve);
		}else {
			customerReprieveMapper.insertOne(customerReprieve);
		}
	}

	@Override
	public void delete(String ids) {
		List<Integer> list = new ArrayList<>();
		String[] idlist = ids.split(",");
		for (String id : idlist) {
			customerReprieveMapper.deleteOne(Integer.valueOf(id));
		}
		
	}

}
