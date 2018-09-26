package com.peng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peng.entity.DataDic;
import com.peng.service.DataDicService;

@Controller
@RequestMapping("dataDic")
public class DataDicController {

	@Autowired
	private DataDicService dataDicService;

	@PostMapping("dataDicComboList")
	@ResponseBody
	public List<DataDic> dataDicComboList(String dataDicName) {
		return dataDicService.queryByName(dataDicName);

	}
}
