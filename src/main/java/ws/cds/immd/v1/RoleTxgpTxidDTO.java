
package ws.cds.immd.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roleTxgpTxidDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roleTxgpTxidDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roleTxgps" type="{http://immd.cds.ws/v1}roleTxgp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="txgpTxids" type="{http://immd.cds.ws/v1}txgpTxid" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="txgps" type="{http://immd.cds.ws/v1}txgp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="txids" type="{http://immd.cds.ws/v1}txid" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roleTxgpTxidDTO", propOrder = {
    "roleTxgps",
    "sysId",
    "txgpTxids",
    "txgps",
    "txids"
})
public class RoleTxgpTxidDTO {

    @XmlElement(nillable = true)
    protected List<RoleTxgp> roleTxgps;
    protected String sysId;
    @XmlElement(nillable = true)
    protected List<TxgpTxid> txgpTxids;
    @XmlElement(nillable = true)
    protected List<Txgp> txgps;
    @XmlElement(nillable = true)
    protected List<Txid> txids;

    /**
     * Gets the value of the roleTxgps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roleTxgps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoleTxgps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleTxgp }
     * 
     * 
     */
    public List<RoleTxgp> getRoleTxgps() {
        if (roleTxgps == null) {
            roleTxgps = new ArrayList<RoleTxgp>();
        }
        return this.roleTxgps;
    }

    /**
     * Gets the value of the sysId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysId() {
        return sysId;
    }

    /**
     * Sets the value of the sysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysId(String value) {
        this.sysId = value;
    }

    /**
     * Gets the value of the txgpTxids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txgpTxids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxgpTxids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxgpTxid }
     * 
     * 
     */
    public List<TxgpTxid> getTxgpTxids() {
        if (txgpTxids == null) {
            txgpTxids = new ArrayList<TxgpTxid>();
        }
        return this.txgpTxids;
    }

    /**
     * Gets the value of the txgps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txgps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxgps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Txgp }
     * 
     * 
     */
    public List<Txgp> getTxgps() {
        if (txgps == null) {
            txgps = new ArrayList<Txgp>();
        }
        return this.txgps;
    }

    /**
     * Gets the value of the txids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Txid }
     * 
     * 
     */
    public List<Txid> getTxids() {
        if (txids == null) {
            txids = new ArrayList<Txid>();
        }
        return this.txids;
    }

}
