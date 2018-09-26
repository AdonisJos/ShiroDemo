package com.peng.dao.mapper;

import java.util.List;

import com.peng.entity.DataDic;

public interface DataDicMapper {

	public List<DataDic> queryByName(String dataDicName);

}
