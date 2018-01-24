
package com.pccw.immd.adminfunc.ws.upms.cxf;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-09T18:11:22.257+08:00
 * Generated source version: 3.2.1
 *
 */
public final class LDAPImmdUserServiceExtWS_LDAPImmdUserServiceExtWSImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://immd.upms.ws/v1", "LDAPImmdUserServiceExtWS");

    private LDAPImmdUserServiceExtWS_LDAPImmdUserServiceExtWSImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = LDAPImmdUserServiceExtWS_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        LDAPImmdUserServiceExtWS_Service ss = new LDAPImmdUserServiceExtWS_Service(wsdlURL, SERVICE_NAME);
        LDAPImmdUserServiceExtWS port = ss.getLDAPImmdUserServiceExtWSImplPort();

        {
            System.out.println("Invoking getCurrentlySignOnUserByLocId...");
            java.lang.String _getCurrentlySignOnUserByLocId_locID = "";
            java.lang.Boolean _getCurrentlySignOnUserByLocId_isWithUserDetail = null;
            try {
                java.util.List<com.pccw.immd.adminfunc.ws.upms.cxf.UserSimpleDetailDTO> _getCurrentlySignOnUserByLocId__return = port.getCurrentlySignOnUserByLocId(_getCurrentlySignOnUserByLocId_locID, _getCurrentlySignOnUserByLocId_isWithUserDetail);
                System.out.println("getCurrentlySignOnUserByLocId.result=" + _getCurrentlySignOnUserByLocId__return);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking invalidUserLogin...");
            java.lang.String _invalidUserLogin_errorCode = "";
            java.lang.String _invalidUserLogin_errorMsg = "";
            try {
                port.invalidUserLogin(_invalidUserLogin_errorCode, _invalidUserLogin_errorMsg);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking getCurrentlySignOnUserByLocIdBySysId...");
            com.pccw.immd.adminfunc.ws.upms.cxf.GetCurrentlySignOnUserByLocIdBySysId _getCurrentlySignOnUserByLocIdBySysId_parameters = null;
            com.pccw.immd.adminfunc.ws.upms.cxf.AppUserInfoHeader _getCurrentlySignOnUserByLocIdBySysId_appInfo = null;
            try {
                com.pccw.immd.adminfunc.ws.upms.cxf.GetCurrentlySignOnUserByLocIdBySysIdResponse _getCurrentlySignOnUserByLocIdBySysId__return = port.getCurrentlySignOnUserByLocIdBySysId(_getCurrentlySignOnUserByLocIdBySysId_parameters, _getCurrentlySignOnUserByLocIdBySysId_appInfo);
                System.out.println("getCurrentlySignOnUserByLocIdBySysId.result=" + _getCurrentlySignOnUserByLocIdBySysId__return);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking validateImmdToken...");
            java.lang.String _validateImmdToken_immdToken = "";
            try {
                port.validateImmdToken(_validateImmdToken_immdToken);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking userDetailEnquiry...");
            java.lang.String _userDetailEnquiry_immdToken = "";
            try {
                com.pccw.immd.adminfunc.ws.upms.cxf.Iss3UserDTO _userDetailEnquiry__return = port.userDetailEnquiry(_userDetailEnquiry_immdToken);
                System.out.println("userDetailEnquiry.result=" + _userDetailEnquiry__return);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking changePassword...");
            java.lang.String _changePassword_userID = "";
            java.lang.String _changePassword_hashedCurrentPassword = "";
            java.lang.String _changePassword_hashedNewPassword = "";
            try {
                port.changePassword(_changePassword_userID, _changePassword_hashedCurrentPassword, _changePassword_hashedNewPassword);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking forceLogout...");
            java.lang.String _forceLogout_userID = "";
            try {
                port.forceLogout(_forceLogout_userID);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking userAuthenticate...");
            com.pccw.immd.adminfunc.ws.upms.cxf.UserAuthenticate _userAuthenticate_parameters = null;
            com.pccw.immd.adminfunc.ws.upms.cxf.AppUserInfoHeader _userAuthenticate_appInfo = null;
//            try {
//                ws.upms.immd.v1.UserAuthenticateResponse _userAuthenticate__return = port.userAuthenticate(_userAuthenticate_parameters, _userAuthenticate_appInfo);
//                System.out.println("userAuthenticate.result=" + _userAuthenticate__return);
//
////            } catch (ITIAppException e) {
////                System.out.println("Expected exception: ITIAppException has occurred.");
////                System.out.println(e.toString());
////            } catch (ITISysException e) {
////                System.out.println("Expected exception: ITISysException has occurred.");
////                System.out.println(e.toString());
////            }
        }
        {
            System.out.println("Invoking setSessionExpiry...");
            java.lang.String _setSessionExpiry_userID = "";
            java.lang.String _setSessionExpiry_immdToken = "";
            javax.xml.datatype.XMLGregorianCalendar _setSessionExpiry_sessionExpiryDate = null;
            try {
                port.setSessionExpiry(_setSessionExpiry_userID, _setSessionExpiry_immdToken, _setSessionExpiry_sessionExpiryDate);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }
        {
            System.out.println("Invoking getUserListByRoleCdAndLocId...");
            java.util.List<java.lang.String> _getUserListByRoleCdAndLocId_roleCds = null;
            java.util.List<java.lang.String> _getUserListByRoleCdAndLocId_locIDs = null;
            try {
                java.util.List<com.pccw.immd.adminfunc.ws.upms.cxf.UserPwd> _getUserListByRoleCdAndLocId__return = port.getUserListByRoleCdAndLocId(_getUserListByRoleCdAndLocId_roleCds, _getUserListByRoleCdAndLocId_locIDs);
                System.out.println("getUserListByRoleCdAndLocId.result=" + _getUserListByRoleCdAndLocId__return);

            } catch (ITIAppException e) {
                System.out.println("Expected exception: ITIAppException has occurred.");
                System.out.println(e.toString());
            } catch (ITISysException e) {
                System.out.println("Expected exception: ITISysException has occurred.");
                System.out.println(e.toString());
            }
        }

        System.exit(0);
    }

}