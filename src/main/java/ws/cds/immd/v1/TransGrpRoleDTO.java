
package ws.cds.immd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transGrpRoleDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transGrpRoleDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txGrpDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transGrpRoleDTO", propOrder = {
    "roleCd",
    "txGrpDesc",
    "txGrpId"
})
public class TransGrpRoleDTO {

    protected String roleCd;
    protected String txGrpDesc;
    protected String txGrpId;

    /**
     * Gets the value of the roleCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCd() {
        return roleCd;
    }

    /**
     * Sets the value of the roleCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCd(String value) {
        this.roleCd = value;
    }

    /**
     * Gets the value of the txGrpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxGrpDesc() {
        return txGrpDesc;
    }

    /**
     * Sets the value of the txGrpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxGrpDesc(String value) {
        this.txGrpDesc = value;
    }

    /**
     * Gets the value of the txGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxGrpId() {
        return txGrpId;
    }

    /**
     * Sets the value of the txGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxGrpId(String value) {
        this.txGrpId = value;
    }

}
