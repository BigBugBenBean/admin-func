package com.pccw.immd.adminfunc.config;


import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ws.cds.immd.v1.EnquireTransactionGroupServiceWSImplPortImpl;

import javax.xml.ws.Endpoint;


@Configuration
public class WebServiceConfiguration {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new EnquireTransactionGroupServiceWSImplPortImpl());
//        http://localhost:8080/adminfunc/webservices/enquireTrxGroupWS?wsdl
        endpoint.publish("/enquireTrxGroupWS");
        return endpoint;
    }

    @Bean
    public ServletRegistrationBean cxfServlet() {
        final ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean(new CXFServlet(), "/webservices/*");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
        /*
        <servlet>
         */
    }
}
