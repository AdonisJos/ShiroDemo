package com.peng.service;

import java.util.List;

import com.peng.entity.DataDic;

public interface DataDicService {

	public List<DataDic> queryByName(String dataDicName);

}
