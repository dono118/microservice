package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
/*	@Bean
	public IRule myRule() {
//		return new RoundRobinRule(); // 轮询
//		return new RandomRule(); //随机
		return new RetryRule(); //重试
	}*/
}
