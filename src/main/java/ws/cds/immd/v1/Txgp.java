
package ws.cds.immd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txgp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txgp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="txGp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txGpDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txgp", propOrder = {
    "txGp",
    "txGpDesc"
})
public class Txgp {

    protected String txGp;
    protected String txGpDesc;

    /**
     * Gets the value of the txGp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxGp() {
        return txGp;
    }

    /**
     * Sets the value of the txGp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxGp(String value) {
        this.txGp = value;
    }

    /**
     * Gets the value of the txGpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxGpDesc() {
        return txGpDesc;
    }

    /**
     * Sets the value of the txGpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxGpDesc(String value) {
        this.txGpDesc = value;
    }

}
