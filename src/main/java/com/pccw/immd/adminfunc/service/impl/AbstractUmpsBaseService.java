package com.pccw.immd.adminfunc.service.impl;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import ws.upms.immd.v1.LDAPImmdUserServiceExtWS;

public abstract class AbstractUmpsBaseService {

    private final static Logger LOOGER = LoggerFactory.getLogger(AbstractUmpsBaseService.class);

    protected final static String NAMESPACE_URI = "http://immd.itifwk.ws/v1";

    protected final static String APP_USER_INFO_HEADER = "AppUserInfo";

    @Value("${web.umps.endpoint}")
    protected String upmsEndpoint;

    private Client proxy;

    private LDAPImmdUserServiceExtWS upmsClientProxy;

    protected Client getProxy(){
        if(proxy == null)
            getUpmsClientProxy();
        return proxy;
    }

    protected LDAPImmdUserServiceExtWS getUpmsClientProxy() {
        if (upmsClientProxy == null) {
            upmsClientProxy = (LDAPImmdUserServiceExtWS) upmsProxyFactoryBean().create();
            proxy = ClientProxy.getClient(upmsClientProxy);
        }
        return upmsClientProxy;
    }

    private JaxWsProxyFactoryBean upmsProxyFactoryBean() {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(LDAPImmdUserServiceExtWS.class);
        proxyFactory.setAddress(upmsEndpoint);
        return proxyFactory;
    }
}
