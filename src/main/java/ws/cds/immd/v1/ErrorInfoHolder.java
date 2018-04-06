
package ws.cds.immd.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorInfoHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="errorInfoHolder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorInfos" type="{http://immd.cds.ws/v1}errorInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorInfoHolder", propOrder = {
    "errorInfos"
})
public class ErrorInfoHolder {

    @XmlElement(nillable = true)
    protected List<ErrorInfo> errorInfos;

    /**
     * Gets the value of the errorInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorInfo }
     * 
     * 
     */
    public List<ErrorInfo> getErrorInfos() {
        if (errorInfos == null) {
            errorInfos = new ArrayList<ErrorInfo>();
        }
        return this.errorInfos;
    }

}
