package com.asiainfo.bdx.dataservice.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <b>function:</b>请求Spring整合CXF的WebService客户端
 */

public class TestClientSpring {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring/spring-cxfclient.xml");
		IService service = ctx.getBean("userWsClient", IService.class);
		System.out.println("#############Client getUserByName##############");
		User user = service.getUserByName("hoojo");
        System.out.println("----------"+user.getName());
        System.out.println("----------"+user.getAddress());
		user.setAddress("China-Guangzhou");
		service.setUser(user);
	}
}
