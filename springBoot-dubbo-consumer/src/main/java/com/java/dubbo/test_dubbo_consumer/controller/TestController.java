package com.java.dubbo.test_dubbo_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.dubbo.test_dubbo_consumer.service.impl.TestConServiceImpl;

@RestController
public class TestController {
	
	@Autowired
	private TestConServiceImpl testConServiceImpl;

	@RequestMapping(value = "/test/{name}" ,method = RequestMethod.GET)
	public String test(@PathVariable("name") String name){
		return testConServiceImpl.test(name);
	}
}
