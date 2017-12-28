package com.java.dubbo.test_dubbo_consumer.service.impl;

import org.springframework.stereotype.Service;

import com.java.dubbo.Test_dubbo_interface.service.FindTestService;
import com.java.dubbo.test_dubbo_consumer.service.ITestConService;
@Service
public class TestConServiceImpl implements ITestConService{

	@com.alibaba.dubbo.config.annotation.Reference
    public FindTestService findTestService;
	
	public String test(String name){
		return findTestService.sayHello(name);
	}

}
