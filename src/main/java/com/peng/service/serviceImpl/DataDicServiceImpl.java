package com.peng.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peng.dao.mapper.DataDicMapper;
import com.peng.entity.DataDic;
import com.peng.service.DataDicService;

@Service
public class DataDicServiceImpl implements DataDicService {

	@Autowired
	private DataDicMapper dataDicMapper;

	@Override
	public List<DataDic> queryByName(String dataDicName) {
		return dataDicMapper.queryByName(dataDicName);
	}

}
