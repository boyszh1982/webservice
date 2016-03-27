package com.asiainfo.bdx.dataservice.demo;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
public class TestClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IService.class);
        factory.setAddress("http://localhost:8080/DataService/Users");
        IService service = (IService) factory.create();
        System.out.println("#############Client getUserByName##############");
        User user = service.getUserByName("hoojo");
        System.out.println("----------"+user.getName());
        System.out.println("----------"+user.getAddress());
        user.setAddress("China-Guangzhou");
        service.setUser(user);
    }
}

