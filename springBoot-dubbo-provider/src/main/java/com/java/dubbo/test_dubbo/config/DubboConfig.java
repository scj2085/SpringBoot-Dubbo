package com.java.dubbo.test_dubbo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

@Configuration
public class DubboConfig {

	@Autowired
	private DubboProperties dubboProperties;
	
	@Bean
	public RegistryConfig registry() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress(dubboProperties.getZookeeperAddress());
		registryConfig.setProtocol(dubboProperties.getProtocol());
		return registryConfig;
	}

	@Bean
	public ApplicationConfig application() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(dubboProperties.getApplicationName());
		return applicationConfig;
	}

	@Bean
	public MonitorConfig monitorConfig() {
		MonitorConfig mc = new MonitorConfig();
		mc.setProtocol(dubboProperties.getMonitorConfig());
		return mc;
	}

	@Bean
	public ReferenceConfig referenceConfig() {
		ReferenceConfig rc = new ReferenceConfig();
		rc.setMonitor(monitorConfig());
		return rc;
	}

	@Bean
	public ProtocolConfig protocol() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setPort(dubboProperties.getProt());
		return protocolConfig;
	}

	@Bean
	public ProviderConfig provider() {
		ProviderConfig providerConfig = new ProviderConfig();
		providerConfig.setMonitor(monitorConfig());
		return providerConfig;
	}

//	@Bean
//	public ServiceBean<FindTestService> personServiceExport(FindTestService findTestService) {
//		ServiceBean<FindTestService> serviceBean = new ServiceBean<FindTestService>();
//		serviceBean.setProxy("javassist");
//		serviceBean.setVersion("0.0.1");
//		serviceBean.setInterface(FindTestService.class.getName());
//		serviceBean.setRef(findTestService);
//		serviceBean.setTimeout(5000);
//		serviceBean.setRetries(3);
//		return serviceBean;
//	}
}
