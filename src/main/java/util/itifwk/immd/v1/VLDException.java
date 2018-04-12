
package util.itifwk.immd.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ws.cds.immd.v1.ErrorInfoHolder;


/**
 * <p>Java class for VLDException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VLDException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infoHandler" type="{http://immd.cds.ws/v1}errorInfoHolder" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VLDException", propOrder = {
    "infoHandler",
    "message"
})
public class VLDException {

    protected ErrorInfoHolder infoHandler;
    protected String message;

    /**
     * Gets the value of the infoHandler property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorInfoHolder }
     *     
     */
    public ErrorInfoHolder getInfoHandler() {
        return infoHandler;
    }

    /**
     * Sets the value of the infoHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorInfoHolder }
     *     
     */
    public void setInfoHandler(ErrorInfoHolder value) {
        this.infoHandler = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
