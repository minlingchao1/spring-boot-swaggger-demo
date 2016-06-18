package com.yunbei.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author: mlc
 * @dat: 2016年6月4日
 * @Description: TODO
 */

@Controller
@RequestMapping("/api/test")
public class TestController {

	@ResponseBody
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	@ApiOperation(value = "测试接口", notes = "测试接口描述")
	public String show(
			@ApiParam(required = true, name = "name", value = "姓名") @RequestParam(name = "name") String name) {

		return name;
	}
}
