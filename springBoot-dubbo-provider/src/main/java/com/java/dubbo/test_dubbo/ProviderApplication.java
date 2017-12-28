package com.java.dubbo.test_dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.java.dubbo.test_dubbo.service.impl")//扫描提供者阿里的@Service注解，此注解代表dubbo服务的提供者
public class ProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}
}
