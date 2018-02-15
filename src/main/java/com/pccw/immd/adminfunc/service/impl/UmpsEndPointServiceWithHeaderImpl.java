package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.UmpsEndPointServiceWithHeader;
import com.pccw.immd.adminfunc.utils.PasswordUtil;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ws.upms.immd.v1.AppUserInfoHeader;
import ws.upms.immd.v1.ITIAppException;
import ws.upms.immd.v1.ITISysException;
import ws.upms.immd.v1.Iss3UserSignOnDTO;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@Service("umpsEndPointServiceWithHeader")
public class UmpsEndPointServiceWithHeaderImpl extends AbstractUmpsBaseService implements UmpsEndPointServiceWithHeader {

    private final static Logger LOOGER = LoggerFactory.getLogger(UmpsEndPointServiceWithHeaderImpl.class);

    public Iss3UserSignOnDTO userAuthenticate(String userId, String password, String terminalId) throws ITIAppException, ITISysException {
        // TODO: Waiting Jason Tam  confirm the System ID for AdminFunc
        // Temporary set to "UP"
        String systemId = "UP";
        String hashedPassword = PasswordUtil.performHash(password);

        addSoapHeader(userId, systemId, terminalId);
        Iss3UserSignOnDTO authenticatedUser = getUpmsClientProxy().userAuthenticate(userId, hashedPassword, terminalId);
        return authenticatedUser;
    }

    private void addSoapHeader(String userId, String systemId, String terminalId) {
        List<Header> headers = new ArrayList<Header>();
        AppUserInfoHeader appHeader = new AppUserInfoHeader();
        appHeader.setSystemID(systemId);
        
        /**
         * Terminal ID must NULL
         */
        appHeader.setTerminalID(terminalId);
        appHeader.setUserID(userId);
        Header appUserInfoHeader = null;
        try {
            appUserInfoHeader = new Header(new QName(NAMESPACE_URI, APP_USER_INFO_HEADER),
                    appHeader,
                    new JAXBDataBinding(AppUserInfoHeader.class));
        } catch (JAXBException e) {
            LOOGER.debug("Form Header Exception ... ");
        }

        headers.add(appUserInfoHeader);
        getProxy().getRequestContext().put(Header.HEADER_LIST, headers);
    }
}
