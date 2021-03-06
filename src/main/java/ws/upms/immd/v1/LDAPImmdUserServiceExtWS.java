package ws.upms.immd.v1;

import org.apache.cxf.interceptor.OutInterceptors;

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
 * 2018-01-05T16:41:14.926+08:00
 * Generated source version: 3.2.1
 *
 */
@WebService(targetNamespace = "http://immd.upms.ws/v1", name = "LDAPImmdUserServiceExtWS")
@XmlSeeAlso({util.itifwk.immd.v1.ObjectFactory.class, ObjectFactory.class})
//@OutInterceptors(interceptors = {"com.pccw.immd.adminfunc.ws.interceptor.AuthUserOutInterceptor" })
public interface LDAPImmdUserServiceExtWS {

    @WebMethod
    @RequestWrapper(localName = "getCurrentlySignOnUserByLocId", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.GetCurrentlySignOnUserByLocId")
    @ResponseWrapper(localName = "getCurrentlySignOnUserByLocIdResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.GetCurrentlySignOnUserByLocIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<UserSimpleDetailDTO> getCurrentlySignOnUserByLocId(
            @WebParam(name = "locID", targetNamespace = "")
                    String locID,
            @WebParam(name = "isWithUserDetail", targetNamespace = "")
                    Boolean isWithUserDetail
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @RequestWrapper(localName = "invalidUserLogin", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.InvalidUserLogin")
    @ResponseWrapper(localName = "invalidUserLoginResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.InvalidUserLoginResponse")
    public void invalidUserLogin(
            @WebParam(name = "errorCode", targetNamespace = "")
                    String errorCode,
            @WebParam(name = "errorMsg", targetNamespace = "")
                    String errorMsg
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "getCurrentlySignOnUserByLocIdBySysIdResponse", targetNamespace = "http://immd.upms.ws/v1", partName = "parameters")
    public GetCurrentlySignOnUserByLocIdBySysIdResponse getCurrentlySignOnUserByLocIdBySysId(
            @WebParam(partName = "parameters", name = "getCurrentlySignOnUserByLocIdBySysId", targetNamespace = "http://immd.upms.ws/v1")
                    GetCurrentlySignOnUserByLocIdBySysId parameters,
            @WebParam(partName = "appInfo", name = "appInfo", targetNamespace = "http://immd.upms.ws/v1", header = true)
                    AppUserInfoHeader appInfo
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @RequestWrapper(localName = "validateImmdToken", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.ValidateImmdToken")
    @ResponseWrapper(localName = "validateImmdTokenResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.ValidateImmdTokenResponse")
    public void validateImmdToken(
            @WebParam(name = "immdToken", targetNamespace = "")
                    String immdToken
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @RequestWrapper(localName = "userDetailEnquiry", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.UserDetailEnquiry")
    @ResponseWrapper(localName = "userDetailEnquiryResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.UserDetailEnquiryResponse")
    @WebResult(name = "return", targetNamespace = "")
    public Iss3UserDTO userDetailEnquiry(
            @WebParam(name = "immdToken", targetNamespace = "")
                    String immdToken
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @RequestWrapper(localName = "changePassword", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.ChangePassword")
    @ResponseWrapper(localName = "changePasswordResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.ChangePasswordResponse")
    public void changePassword(
            @WebParam(name = "userID", targetNamespace = "")
                    String userID,
            @WebParam(name = "hashedCurrentPassword", targetNamespace = "")
                    String hashedCurrentPassword,
            @WebParam(name = "hashedNewPassword", targetNamespace = "")
                    String hashedNewPassword
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @RequestWrapper(localName = "forceLogout", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.ForceLogout")
    @ResponseWrapper(localName = "forceLogoutResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.ForceLogoutResponse")
    public void forceLogout(
            @WebParam(name = "userID", targetNamespace = "")
                    String userID
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @RequestWrapper(localName = "userAuthenticate", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.UserAuthenticate")
    @ResponseWrapper(localName = "userAuthenticateResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.UserAuthenticateResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ws.upms.immd.v1.Iss3UserSignOnDTO userAuthenticate(
            @WebParam(name = "userID", targetNamespace = "")
                    java.lang.String userID,
            @WebParam(name = "hashedPassword", targetNamespace = "")
                    java.lang.String hashedPassword,
            @WebParam(name = "terminalID", targetNamespace = "")
                    java.lang.String terminalID
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @RequestWrapper(localName = "setSessionExpiry", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.SetSessionExpiry")
    @ResponseWrapper(localName = "setSessionExpiryResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.SetSessionExpiryResponse")
    public void setSessionExpiry(
            @WebParam(name = "userID", targetNamespace = "")
                    String userID,
            @WebParam(name = "immdToken", targetNamespace = "")
                    String immdToken,
            @WebParam(name = "sessionExpiryDate", targetNamespace = "")
                    javax.xml.datatype.XMLGregorianCalendar sessionExpiryDate
    ) throws ITIAppException, ITISysException;

    @WebMethod
    @RequestWrapper(localName = "getUserListByRoleCdAndLocId", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.GetUserListByRoleCdAndLocId")
    @ResponseWrapper(localName = "getUserListByRoleCdAndLocIdResponse", targetNamespace = "http://immd.upms.ws/v1", className = "ws.upms.immd.v1.GetUserListByRoleCdAndLocIdResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<UserPwd> getUserListByRoleCdAndLocId(
            @WebParam(name = "roleCds", targetNamespace = "")
                    java.util.List<String> roleCds,
            @WebParam(name = "locIDs", targetNamespace = "")
                    java.util.List<String> locIDs
    ) throws ITIAppException, ITISysException;
}
