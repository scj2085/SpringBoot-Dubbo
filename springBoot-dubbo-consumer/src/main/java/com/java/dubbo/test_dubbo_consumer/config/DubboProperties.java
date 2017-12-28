package com.java.dubbo.test_dubbo_consumer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by mengxiangrui on 2017/10/16.
 * Dubbo配置
 */
@Component
@ConfigurationProperties(prefix = "dubbo")
public class DubboProperties {
   
	private String applicationName; 	//应用名称
    private String zookeeperAddress; 	//zookeeper注册地址
    private Integer prot; 			//dubbo暴露端口
    private String protocol;
    private String monitorConfig;
    
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getZookeeperAddress() {
        return zookeeperAddress;
    }

    public void setZookeeperAddress(String zookeeperAddress) {
        this.zookeeperAddress = zookeeperAddress;
    }

	public Integer getProt() {
		return prot;
	}

	public void setProt(Integer prot) {
		this.prot = prot;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getMonitorConfig() {
		return monitorConfig;
	}

	public void setMonitorConfig(String monitorConfig) {
		this.monitorConfig = monitorConfig;
	}

    
}
