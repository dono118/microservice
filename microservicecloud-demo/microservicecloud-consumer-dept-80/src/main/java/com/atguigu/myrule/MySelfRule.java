package com.atguigu.myrule;

import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {

	public IRule myRule() {
		return new RandomRule_ZY();
	}
}
