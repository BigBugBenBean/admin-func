
package ws.cds.immd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enquireTxIDsByRoleCd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enquireTxIDsByRoleCd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enquireTxIDsByRoleCd", propOrder = {
    "roleCd"
})
public class EnquireTxIDsByRoleCd {

    protected String roleCd;

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

}
