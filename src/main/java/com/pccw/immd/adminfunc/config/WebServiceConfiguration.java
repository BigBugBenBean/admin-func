package com.pccw.immd.adminfunc.config;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfiguration {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint upmsEndPoint() {
        System.out.println("---------------upmsEndPoint--------------");
//        EndpointImpl endpoint = new EndpointImpl(springBus(), new XXXXImpl());
//        endpoint.publish("/blablalba");
//        return endpoint;

        return null;
    }

    @Bean
    public ServletRegistrationBean dispatcherServlet() {
        System.out.println("---------------dispatcherServlet--------------");
        ServletRegistrationBean servlet = new ServletRegistrationBean(new CXFServlet(), "/soap-api/");
        servlet.setLoadOnStartup(1);
        return servlet;
    }

}
