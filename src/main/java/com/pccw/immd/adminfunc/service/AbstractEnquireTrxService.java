package com.pccw.immd.adminfunc.service;


import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import ws.cds.immd.v1.EnquireTransactionGroupServiceWS;
import ws.upms.immd.v1.LDAPImmdUserServiceExtWS;

public abstract class AbstractEnquireTrxService {

    protected final static String NAMESPACE_URI = "http://immd.cds.ws/v1";

    @Value("${web.trxgrp.endpoint}")
    protected String trxgrpEndpoint;

    private Client proxy;

    private EnquireTransactionGroupServiceWS trxGrpClientProxy;

    protected Client getProxy(){
        if(proxy == null)
            getUpmsClientProxy();
        return proxy;
    }

    protected EnquireTransactionGroupServiceWS getUpmsClientProxy() {
        if (trxGrpClientProxy == null) {
            trxGrpClientProxy = (EnquireTransactionGroupServiceWS) trxGrpProxyFactoryBean().create();
            proxy = ClientProxy.getClient(trxGrpClientProxy);
        }
        return trxGrpClientProxy;
    }

    private JaxWsProxyFactoryBean trxGrpProxyFactoryBean() {
        JaxWsProxyFactoryBean proxyFactory = new JaxWsProxyFactoryBean();
        proxyFactory.setServiceClass(EnquireTransactionGroupServiceWS.class);
        proxyFactory.setAddress(trxgrpEndpoint);
        return proxyFactory;
    }


}
