package com.peng.service;

import java.util.List;

import com.peng.entity.CustomerReprieve;
import com.peng.form.PageFORM;

public interface CustomerReprieveService {

	List<CustomerReprieve> queryByExample(PageFORM pageFORM,CustomerReprieve customerReprieve);
	
	
	void saveOne(CustomerReprieve customerReprieve);
	
	void delete(String ids);
}
