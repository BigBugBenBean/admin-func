package com.pccw.immd.adminfunc.config;


import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import ws.cds.immd.v1.EnquireTransactionGroupServiceWSImplPortImpl;

import javax.xml.ws.Endpoint;


@Configuration
public class WebServiceConfiguration {

    private static final Logger logger = Logger.getLogger(WebServiceConfiguration.class);


    @Autowired
    @Qualifier("enquireTransactionGroupServiceWSImplPortImpl")
    EnquireTransactionGroupServiceWSImplPortImpl enquireTransactionGroupServiceWSImplPortImpl;

    @Bean
    public Endpoint endpoint() {
        Bus bus = springBus();
        EndpointImpl endpoint = new EndpointImpl(bus, enquireTransactionGroupServiceWSImplPortImpl);
        /* endpointURL -  http://localhost:8080/adminfunc/webservices/enquireTrxGroupWS?wsdl */
        endpoint.publish("/enquireTrxGroupWS");
        logger.info("UPMS Web Service endpoint published.");
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

    @Bean(name=Bus.DEFAULT_BUS_ID)
    // <bean id="cxf" class="org.apache.cxf.bus.spring.SpringBus">
    public SpringBus springBus() {
        return new SpringBus();
    }

}
