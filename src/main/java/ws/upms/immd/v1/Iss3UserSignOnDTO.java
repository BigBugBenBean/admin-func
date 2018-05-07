
package ws.upms.immd.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for iss3UserSignOnDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iss3UserSignOnDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessibleLocs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="controllerSysIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="forceLogoutTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="immdToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="needToDoLocationSignOn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="passwordExpiryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="posts" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roleCDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sysIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="userEngName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iss3UserSignOnDTO", propOrder = {
    "accessibleLocs",
    "controllerSysIDs",
    "externalUser",
    "forceLogoutTerm",
    "immdToken",
    "locID",
    "needToDoLocationSignOn",
    "passwordExpiryDateTime",
    "posts",
    "roleCDs",
    "sysIDs",
    "userEngName"
})
public class Iss3UserSignOnDTO {

    @XmlElement(nillable = true)
    protected List<String> accessibleLocs;
    @XmlElement(nillable = true)
    protected List<String> controllerSysIDs;
    protected boolean externalUser;
    protected String forceLogoutTerm;
    protected String immdToken;
    protected String locID;
    protected boolean needToDoLocationSignOn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordExpiryDateTime;
    @XmlElement(nillable = true)
    protected List<String> posts;
    @XmlElement(nillable = true)
    protected List<String> roleCDs;
    @XmlElement(nillable = true)
    protected List<String> sysIDs;
    protected String userEngName;

    /**
     * Gets the value of the accessibleLocs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibleLocs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibleLocs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAccessibleLocs() {
        if (accessibleLocs == null) {
            accessibleLocs = new ArrayList<String>();
        }
        return this.accessibleLocs;
    }

    /**
     * Gets the value of the controllerSysIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controllerSysIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControllerSysIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getControllerSysIDs() {
        if (controllerSysIDs == null) {
            controllerSysIDs = new ArrayList<String>();
        }
        return this.controllerSysIDs;
    }

    /**
     * Gets the value of the externalUser property.
     * 
     */
    public boolean isExternalUser() {
        return externalUser;
    }

    /**
     * Sets the value of the externalUser property.
     * 
     */
    public void setExternalUser(boolean value) {
        this.externalUser = value;
    }

    /**
     * Gets the value of the forceLogoutTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForceLogoutTerm() {
        return forceLogoutTerm;
    }

    /**
     * Sets the value of the forceLogoutTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForceLogoutTerm(String value) {
        this.forceLogoutTerm = value;
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
     * Gets the value of the locID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocID() {
        return locID;
    }

    /**
     * Sets the value of the locID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocID(String value) {
        this.locID = value;
    }

    /**
     * Gets the value of the needToDoLocationSignOn property.
     * 
     */
    public boolean isNeedToDoLocationSignOn() {
        return needToDoLocationSignOn;
    }

    /**
     * Sets the value of the needToDoLocationSignOn property.
     * 
     */
    public void setNeedToDoLocationSignOn(boolean value) {
        this.needToDoLocationSignOn = value;
    }

    /**
     * Gets the value of the passwordExpiryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordExpiryDateTime() {
        return passwordExpiryDateTime;
    }

    /**
     * Sets the value of the passwordExpiryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordExpiryDateTime(XMLGregorianCalendar value) {
        this.passwordExpiryDateTime = value;
    }

    /**
     * Gets the value of the posts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPosts() {
        if (posts == null) {
            posts = new ArrayList<String>();
        }
        return this.posts;
    }

    /**
     * Gets the value of the roleCDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleCDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleCDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRoleCDs() {
        if (roleCDs == null) {
            roleCDs = new ArrayList<String>();
        }
        return this.roleCDs;
    }

    /**
     * Gets the value of the sysIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sysIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSysIDs() {
        if (sysIDs == null) {
            sysIDs = new ArrayList<String>();
        }
        return this.sysIDs;
    }

    /**
     * Gets the value of the userEngName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEngName() {
        return userEngName;
    }

    /**
     * Sets the value of the userEngName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEngName(String value) {
        this.userEngName = value;
    }

}
