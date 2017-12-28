package com.java.dubbo.test_dubbo_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.java.dubbo.test_dubbo_consumer.service.impl")//扫描dubbo的注解，作为消费者，扫描这个注解@com.alibaba.dubbo.config.annotation.Reference，此注解代表dubbo服务是一个消费者
public class ConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
