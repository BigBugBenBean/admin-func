
package com.pccw.immd.adminfunc.ws.upms.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for appUserInfoHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appUserInfoHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callerFuncID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="systemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terminalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appUserInfoHeader", propOrder = {
    "callerActionCode",
    "callerFuncID",
    "hostName",
    "locationID",
    "sessionId",
    "systemID",
    "terminalID",
    "userID"
})
public class AppUserInfoHeader {

    protected String callerActionCode;
    protected String callerFuncID;
    protected String hostName;
    protected String locationID;
    protected String sessionId;
    protected String systemID;
    protected String terminalID;
    protected String userID;

    /**
     * Gets the value of the callerActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerActionCode() {
        return callerActionCode;
    }

    /**
     * Sets the value of the callerActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerActionCode(String value) {
        this.callerActionCode = value;
    }

    /**
     * Gets the value of the callerFuncID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerFuncID() {
        return callerFuncID;
    }

    /**
     * Sets the value of the callerFuncID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerFuncID(String value) {
        this.callerFuncID = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemID(String value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

}
