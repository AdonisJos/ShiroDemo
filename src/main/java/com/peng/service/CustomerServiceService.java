package com.peng.service;

import java.util.List;

import com.peng.entity.CustomerService;
import com.peng.form.PageFORM;

public interface CustomerServiceService {

	void saveOne(CustomerService customerService);

	List<CustomerService> queryByExample(PageFORM pageFORM, CustomerService customerService);

}
