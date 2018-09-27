package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.CustomerReprieve;

public interface CustomerReprieveMapper {

	List<CustomerReprieve> queryByExample(CustomerReprieve customerReprieve);
	
	
	void updateOne(CustomerReprieve customerReprieve);
	
	void insertOne(CustomerReprieve customerReprieve);
	

	void deleteOne(Integer id);
	
}
