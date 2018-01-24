
package com.pccw.immd.adminfunc.ws.upms.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.upms.immd.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ChangePassword_QNAME = new QName("http://immd.upms.ws/v1", "changePassword");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://immd.upms.ws/v1", "changePasswordResponse");
    private final static QName _ForceLogout_QNAME = new QName("http://immd.upms.ws/v1", "forceLogout");
    private final static QName _ForceLogoutResponse_QNAME = new QName("http://immd.upms.ws/v1", "forceLogoutResponse");
    private final static QName _GetCurrentlySignOnUserByLocId_QNAME = new QName("http://immd.upms.ws/v1", "getCurrentlySignOnUserByLocId");
    private final static QName _GetCurrentlySignOnUserByLocIdBySysId_QNAME = new QName("http://immd.upms.ws/v1", "getCurrentlySignOnUserByLocIdBySysId");
    private final static QName _GetCurrentlySignOnUserByLocIdBySysIdResponse_QNAME = new QName("http://immd.upms.ws/v1", "getCurrentlySignOnUserByLocIdBySysIdResponse");
    private final static QName _GetCurrentlySignOnUserByLocIdResponse_QNAME = new QName("http://immd.upms.ws/v1", "getCurrentlySignOnUserByLocIdResponse");
    private final static QName _GetUserListByRoleCdAndLocId_QNAME = new QName("http://immd.upms.ws/v1", "getUserListByRoleCdAndLocId");
    private final static QName _GetUserListByRoleCdAndLocIdResponse_QNAME = new QName("http://immd.upms.ws/v1", "getUserListByRoleCdAndLocIdResponse");
    private final static QName _InvalidUserLogin_QNAME = new QName("http://immd.upms.ws/v1", "invalidUserLogin");
    private final static QName _InvalidUserLoginResponse_QNAME = new QName("http://immd.upms.ws/v1", "invalidUserLoginResponse");
    private final static QName _SetSessionExpiry_QNAME = new QName("http://immd.upms.ws/v1", "setSessionExpiry");
    private final static QName _SetSessionExpiryResponse_QNAME = new QName("http://immd.upms.ws/v1", "setSessionExpiryResponse");
    private final static QName _UserAuthenticate_QNAME = new QName("http://immd.upms.ws/v1", "userAuthenticate");
    private final static QName _UserAuthenticateResponse_QNAME = new QName("http://immd.upms.ws/v1", "userAuthenticateResponse");
    private final static QName _UserDetailEnquiry_QNAME = new QName("http://immd.upms.ws/v1", "userDetailEnquiry");
    private final static QName _UserDetailEnquiryResponse_QNAME = new QName("http://immd.upms.ws/v1", "userDetailEnquiryResponse");
    private final static QName _ValidateImmdToken_QNAME = new QName("http://immd.upms.ws/v1", "validateImmdToken");
    private final static QName _ValidateImmdTokenResponse_QNAME = new QName("http://immd.upms.ws/v1", "validateImmdTokenResponse");
    private final static QName _AppInfo_QNAME = new QName("http://immd.upms.ws/v1", "appInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.upms.immd.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ForceLogout }
     * 
     */
    public ForceLogout createForceLogout() {
        return new ForceLogout();
    }

    /**
     * Create an instance of {@link ForceLogoutResponse }
     * 
     */
    public ForceLogoutResponse createForceLogoutResponse() {
        return new ForceLogoutResponse();
    }

    /**
     * Create an instance of {@link GetCurrentlySignOnUserByLocId }
     * 
     */
    public GetCurrentlySignOnUserByLocId createGetCurrentlySignOnUserByLocId() {
        return new GetCurrentlySignOnUserByLocId();
    }

    /**
     * Create an instance of {@link GetCurrentlySignOnUserByLocIdBySysId }
     * 
     */
    public GetCurrentlySignOnUserByLocIdBySysId createGetCurrentlySignOnUserByLocIdBySysId() {
        return new GetCurrentlySignOnUserByLocIdBySysId();
    }

    /**
     * Create an instance of {@link GetCurrentlySignOnUserByLocIdBySysIdResponse }
     * 
     */
    public GetCurrentlySignOnUserByLocIdBySysIdResponse createGetCurrentlySignOnUserByLocIdBySysIdResponse() {
        return new GetCurrentlySignOnUserByLocIdBySysIdResponse();
    }

    /**
     * Create an instance of {@link GetCurrentlySignOnUserByLocIdResponse }
     * 
     */
    public GetCurrentlySignOnUserByLocIdResponse createGetCurrentlySignOnUserByLocIdResponse() {
        return new GetCurrentlySignOnUserByLocIdResponse();
    }

    /**
     * Create an instance of {@link GetUserListByRoleCdAndLocId }
     * 
     */
    public GetUserListByRoleCdAndLocId createGetUserListByRoleCdAndLocId() {
        return new GetUserListByRoleCdAndLocId();
    }

    /**
     * Create an instance of {@link GetUserListByRoleCdAndLocIdResponse }
     * 
     */
    public GetUserListByRoleCdAndLocIdResponse createGetUserListByRoleCdAndLocIdResponse() {
        return new GetUserListByRoleCdAndLocIdResponse();
    }

    /**
     * Create an instance of {@link InvalidUserLogin }
     * 
     */
    public InvalidUserLogin createInvalidUserLogin() {
        return new InvalidUserLogin();
    }

    /**
     * Create an instance of {@link InvalidUserLoginResponse }
     * 
     */
    public InvalidUserLoginResponse createInvalidUserLoginResponse() {
        return new InvalidUserLoginResponse();
    }

    /**
     * Create an instance of {@link SetSessionExpiry }
     * 
     */
    public SetSessionExpiry createSetSessionExpiry() {
        return new SetSessionExpiry();
    }

    /**
     * Create an instance of {@link SetSessionExpiryResponse }
     * 
     */
    public SetSessionExpiryResponse createSetSessionExpiryResponse() {
        return new SetSessionExpiryResponse();
    }

    /**
     * Create an instance of {@link UserAuthenticate }
     * 
     */
    public UserAuthenticate createUserAuthenticate() {
        return new UserAuthenticate();
    }

    /**
     * Create an instance of {@link UserAuthenticateResponse }
     * 
     */
    public UserAuthenticateResponse createUserAuthenticateResponse() {
        return new UserAuthenticateResponse();
    }

    /**
     * Create an instance of {@link UserDetailEnquiry }
     * 
     */
    public UserDetailEnquiry createUserDetailEnquiry() {
        return new UserDetailEnquiry();
    }

    /**
     * Create an instance of {@link UserDetailEnquiryResponse }
     * 
     */
    public UserDetailEnquiryResponse createUserDetailEnquiryResponse() {
        return new UserDetailEnquiryResponse();
    }

    /**
     * Create an instance of {@link ValidateImmdToken }
     * 
     */
    public ValidateImmdToken createValidateImmdToken() {
        return new ValidateImmdToken();
    }

    /**
     * Create an instance of {@link ValidateImmdTokenResponse }
     * 
     */
    public ValidateImmdTokenResponse createValidateImmdTokenResponse() {
        return new ValidateImmdTokenResponse();
    }

    /**
     * Create an instance of {@link AppUserInfoHeader }
     * 
     */
    public AppUserInfoHeader createAppUserInfoHeader() {
        return new AppUserInfoHeader();
    }

    /**
     * Create an instance of {@link Iss3UserSignOnDTO }
     * 
     */
    public Iss3UserSignOnDTO createIss3UserSignOnDTO() {
        return new Iss3UserSignOnDTO();
    }

    /**
     * Create an instance of {@link UserSimpleDetailDTO }
     * 
     */
    public UserSimpleDetailDTO createUserSimpleDetailDTO() {
        return new UserSimpleDetailDTO();
    }

    /**
     * Create an instance of {@link UserPwd }
     * 
     */
    public UserPwd createUserPwd() {
        return new UserPwd();
    }

    /**
     * Create an instance of {@link Iss3UserDTO }
     * 
     */
    public Iss3UserDTO createIss3UserDTO() {
        return new Iss3UserDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "changePassword")
    public JAXBElement<ChangePassword> createChangePassword(ChangePassword value) {
        return new JAXBElement<ChangePassword>(_ChangePassword_QNAME, ChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceLogout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "forceLogout")
    public JAXBElement<ForceLogout> createForceLogout(ForceLogout value) {
        return new JAXBElement<ForceLogout>(_ForceLogout_QNAME, ForceLogout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceLogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "forceLogoutResponse")
    public JAXBElement<ForceLogoutResponse> createForceLogoutResponse(ForceLogoutResponse value) {
        return new JAXBElement<ForceLogoutResponse>(_ForceLogoutResponse_QNAME, ForceLogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentlySignOnUserByLocId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "getCurrentlySignOnUserByLocId")
    public JAXBElement<GetCurrentlySignOnUserByLocId> createGetCurrentlySignOnUserByLocId(GetCurrentlySignOnUserByLocId value) {
        return new JAXBElement<GetCurrentlySignOnUserByLocId>(_GetCurrentlySignOnUserByLocId_QNAME, GetCurrentlySignOnUserByLocId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentlySignOnUserByLocIdBySysId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "getCurrentlySignOnUserByLocIdBySysId")
    public JAXBElement<GetCurrentlySignOnUserByLocIdBySysId> createGetCurrentlySignOnUserByLocIdBySysId(GetCurrentlySignOnUserByLocIdBySysId value) {
        return new JAXBElement<GetCurrentlySignOnUserByLocIdBySysId>(_GetCurrentlySignOnUserByLocIdBySysId_QNAME, GetCurrentlySignOnUserByLocIdBySysId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentlySignOnUserByLocIdBySysIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "getCurrentlySignOnUserByLocIdBySysIdResponse")
    public JAXBElement<GetCurrentlySignOnUserByLocIdBySysIdResponse> createGetCurrentlySignOnUserByLocIdBySysIdResponse(GetCurrentlySignOnUserByLocIdBySysIdResponse value) {
        return new JAXBElement<GetCurrentlySignOnUserByLocIdBySysIdResponse>(_GetCurrentlySignOnUserByLocIdBySysIdResponse_QNAME, GetCurrentlySignOnUserByLocIdBySysIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentlySignOnUserByLocIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "getCurrentlySignOnUserByLocIdResponse")
    public JAXBElement<GetCurrentlySignOnUserByLocIdResponse> createGetCurrentlySignOnUserByLocIdResponse(GetCurrentlySignOnUserByLocIdResponse value) {
        return new JAXBElement<GetCurrentlySignOnUserByLocIdResponse>(_GetCurrentlySignOnUserByLocIdResponse_QNAME, GetCurrentlySignOnUserByLocIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListByRoleCdAndLocId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "getUserListByRoleCdAndLocId")
    public JAXBElement<GetUserListByRoleCdAndLocId> createGetUserListByRoleCdAndLocId(GetUserListByRoleCdAndLocId value) {
        return new JAXBElement<GetUserListByRoleCdAndLocId>(_GetUserListByRoleCdAndLocId_QNAME, GetUserListByRoleCdAndLocId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserListByRoleCdAndLocIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "getUserListByRoleCdAndLocIdResponse")
    public JAXBElement<GetUserListByRoleCdAndLocIdResponse> createGetUserListByRoleCdAndLocIdResponse(GetUserListByRoleCdAndLocIdResponse value) {
        return new JAXBElement<GetUserListByRoleCdAndLocIdResponse>(_GetUserListByRoleCdAndLocIdResponse_QNAME, GetUserListByRoleCdAndLocIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidUserLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "invalidUserLogin")
    public JAXBElement<InvalidUserLogin> createInvalidUserLogin(InvalidUserLogin value) {
        return new JAXBElement<InvalidUserLogin>(_InvalidUserLogin_QNAME, InvalidUserLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidUserLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "invalidUserLoginResponse")
    public JAXBElement<InvalidUserLoginResponse> createInvalidUserLoginResponse(InvalidUserLoginResponse value) {
        return new JAXBElement<InvalidUserLoginResponse>(_InvalidUserLoginResponse_QNAME, InvalidUserLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSessionExpiry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "setSessionExpiry")
    public JAXBElement<SetSessionExpiry> createSetSessionExpiry(SetSessionExpiry value) {
        return new JAXBElement<SetSessionExpiry>(_SetSessionExpiry_QNAME, SetSessionExpiry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSessionExpiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "setSessionExpiryResponse")
    public JAXBElement<SetSessionExpiryResponse> createSetSessionExpiryResponse(SetSessionExpiryResponse value) {
        return new JAXBElement<SetSessionExpiryResponse>(_SetSessionExpiryResponse_QNAME, SetSessionExpiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "userAuthenticate")
    public JAXBElement<UserAuthenticate> createUserAuthenticate(UserAuthenticate value) {
        return new JAXBElement<UserAuthenticate>(_UserAuthenticate_QNAME, UserAuthenticate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "userAuthenticateResponse")
    public JAXBElement<UserAuthenticateResponse> createUserAuthenticateResponse(UserAuthenticateResponse value) {
        return new JAXBElement<UserAuthenticateResponse>(_UserAuthenticateResponse_QNAME, UserAuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailEnquiry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "userDetailEnquiry")
    public JAXBElement<UserDetailEnquiry> createUserDetailEnquiry(UserDetailEnquiry value) {
        return new JAXBElement<UserDetailEnquiry>(_UserDetailEnquiry_QNAME, UserDetailEnquiry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDetailEnquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "userDetailEnquiryResponse")
    public JAXBElement<UserDetailEnquiryResponse> createUserDetailEnquiryResponse(UserDetailEnquiryResponse value) {
        return new JAXBElement<UserDetailEnquiryResponse>(_UserDetailEnquiryResponse_QNAME, UserDetailEnquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateImmdToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "validateImmdToken")
    public JAXBElement<ValidateImmdToken> createValidateImmdToken(ValidateImmdToken value) {
        return new JAXBElement<ValidateImmdToken>(_ValidateImmdToken_QNAME, ValidateImmdToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateImmdTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "validateImmdTokenResponse")
    public JAXBElement<ValidateImmdTokenResponse> createValidateImmdTokenResponse(ValidateImmdTokenResponse value) {
        return new JAXBElement<ValidateImmdTokenResponse>(_ValidateImmdTokenResponse_QNAME, ValidateImmdTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppUserInfoHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.upms.ws/v1", name = "appInfo")
    public JAXBElement<AppUserInfoHeader> createAppInfo(AppUserInfoHeader value) {
        return new JAXBElement<AppUserInfoHeader>(_AppInfo_QNAME, AppUserInfoHeader.class, null, value);
    }

}
