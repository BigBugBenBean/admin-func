
package com.pccw.immd.adminfunc.ws.upms.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for setSessionExpiry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setSessionExpiry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="immdToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sessionExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setSessionExpiry", propOrder = {
    "userID",
    "immdToken",
    "sessionExpiryDate"
})
public class SetSessionExpiry {

    protected String userID;
    protected String immdToken;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sessionExpiryDate;

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

    /**
     * Gets the value of the immdToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmdToken() {
        return immdToken;
    }

    /**
     * Sets the value of the immdToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmdToken(String value) {
        this.immdToken = value;
    }

    /**
     * Gets the value of the sessionExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionExpiryDate() {
        return sessionExpiryDate;
    }

    /**
     * Sets the value of the sessionExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionExpiryDate(XMLGregorianCalendar value) {
        this.sessionExpiryDate = value;
    }

}
