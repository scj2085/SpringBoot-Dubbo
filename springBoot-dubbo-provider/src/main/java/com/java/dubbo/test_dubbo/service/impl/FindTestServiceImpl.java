package com.java.dubbo.test_dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.dubbo.Test_dubbo_interface.service.FindTestService;

@Service(timeout = 5000)
public class FindTestServiceImpl implements FindTestService{

	public String sayHello(String name) {
		return "Hello " + name;
	}

}
