package com.asiainfo.bdx.dsrv.client.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.bdx.dsrv.demo.Hello;

public final class Client {

	public static void main(String args[]) throws Exception {
		// 加载配置
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-cxfclient.xml");
		// 获取ws实例
		Hello client = (Hello) ctx.getBean("client");
		String response = client.sayHello("2012");
		System.out.println("Response: " + response);
	}
}