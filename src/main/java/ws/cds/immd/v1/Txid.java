
package ws.cds.immd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for txid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="txid"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="txid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txidDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txid", propOrder = {
    "txid",
    "txidDesc"
})
public class Txid {

    protected String txid;
    protected String txidDesc;

    /**
     * Gets the value of the txid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Sets the value of the txid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxid(String value) {
        this.txid = value;
    }

    /**
     * Gets the value of the txidDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxidDesc() {
        return txidDesc;
    }

    /**
     * Sets the value of the txidDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxidDesc(String value) {
        this.txidDesc = value;
    }

}
