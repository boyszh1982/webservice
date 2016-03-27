package com.asiainfo.bdx.dsrv.demo.impl;

import javax.jws.WebService;

import com.asiainfo.bdx.dsrv.demo.Hello;

@WebService(endpointInterface="com.asiainfo.bdx.dsrv.demo.Hello")
public class HelloImpl implements Hello{

	public String sayHello(String msg) {
		// TODO Auto-generated method stub
		System.out.println("msg="+msg );
		return "Hello "+msg ;
	}

}
