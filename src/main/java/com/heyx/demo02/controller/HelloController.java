package com.heyx.demo02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World";
	}

	@RequestMapping("/success")
	public String success(Map<String,Object> map){
		map.put("hello","<h1>你好</h1>");
		map.put("users", Arrays.asList("zhangsan","list","wangwu"));
		return "success";
	}

	@RequestMapping("/bimtest")
	public String bimtest(){
		return "bimtest";
	}

}
