
package ws.cds.immd.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.cds.immd.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnquireAllData_QNAME = new QName("http://immd.cds.ws/v1", "enquireAllData");
    private final static QName _EnquireAllDataResponse_QNAME = new QName("http://immd.cds.ws/v1", "enquireAllDataResponse");
    private final static QName _EnquireTransactionGroup_QNAME = new QName("http://immd.cds.ws/v1", "enquireTransactionGroup");
    private final static QName _EnquireTransactionGroupResponse_QNAME = new QName("http://immd.cds.ws/v1", "enquireTransactionGroupResponse");
    private final static QName _EnquireTxIDsByRoleCd_QNAME = new QName("http://immd.cds.ws/v1", "enquireTxIDsByRoleCd");
    private final static QName _EnquireTxIDsByRoleCdResponse_QNAME = new QName("http://immd.cds.ws/v1", "enquireTxIDsByRoleCdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.cds.immd.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnquireAllData }
     * 
     */
    public EnquireAllData createEnquireAllData() {
        return new EnquireAllData();
    }

    /**
     * Create an instance of {@link EnquireAllDataResponse }
     * 
     */
    public EnquireAllDataResponse createEnquireAllDataResponse() {
        return new EnquireAllDataResponse();
    }

    /**
     * Create an instance of {@link EnquireTransactionGroup }
     * 
     */
    public EnquireTransactionGroup createEnquireTransactionGroup() {
        return new EnquireTransactionGroup();
    }

    /**
     * Create an instance of {@link EnquireTransactionGroupResponse }
     * 
     */
    public EnquireTransactionGroupResponse createEnquireTransactionGroupResponse() {
        return new EnquireTransactionGroupResponse();
    }

    /**
     * Create an instance of {@link EnquireTxIDsByRoleCd }
     * 
     */
    public EnquireTxIDsByRoleCd createEnquireTxIDsByRoleCd() {
        return new EnquireTxIDsByRoleCd();
    }

    /**
     * Create an instance of {@link EnquireTxIDsByRoleCdResponse }
     * 
     */
    public EnquireTxIDsByRoleCdResponse createEnquireTxIDsByRoleCdResponse() {
        return new EnquireTxIDsByRoleCdResponse();
    }

    /**
     * Create an instance of {@link Txid }
     * 
     */
    public Txid createTxid() {
        return new Txid();
    }

    /**
     * Create an instance of {@link RoleTxgpTxidDTO }
     * 
     */
    public RoleTxgpTxidDTO createRoleTxgpTxidDTO() {
        return new RoleTxgpTxidDTO();
    }

    /**
     * Create an instance of {@link RoleTxgp }
     * 
     */
    public RoleTxgp createRoleTxgp() {
        return new RoleTxgp();
    }

    /**
     * Create an instance of {@link TxgpTxid }
     * 
     */
    public TxgpTxid createTxgpTxid() {
        return new TxgpTxid();
    }

    /**
     * Create an instance of {@link Txgp }
     * 
     */
    public Txgp createTxgp() {
        return new Txgp();
    }

    /**
     * Create an instance of {@link ErrorInfoHolder }
     * 
     */
    public ErrorInfoHolder createErrorInfoHolder() {
        return new ErrorInfoHolder();
    }

    /**
     * Create an instance of {@link ErrorInfo }
     * 
     */
    public ErrorInfo createErrorInfo() {
        return new ErrorInfo();
    }

    /**
     * Create an instance of {@link TransGrpRoleDTO }
     * 
     */
    public TransGrpRoleDTO createTransGrpRoleDTO() {
        return new TransGrpRoleDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquireAllData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.cds.ws/v1", name = "enquireAllData")
    public JAXBElement<EnquireAllData> createEnquireAllData(EnquireAllData value) {
        return new JAXBElement<EnquireAllData>(_EnquireAllData_QNAME, EnquireAllData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquireAllDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.cds.ws/v1", name = "enquireAllDataResponse")
    public JAXBElement<EnquireAllDataResponse> createEnquireAllDataResponse(EnquireAllDataResponse value) {
        return new JAXBElement<EnquireAllDataResponse>(_EnquireAllDataResponse_QNAME, EnquireAllDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquireTransactionGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.cds.ws/v1", name = "enquireTransactionGroup")
    public JAXBElement<EnquireTransactionGroup> createEnquireTransactionGroup(EnquireTransactionGroup value) {
        return new JAXBElement<EnquireTransactionGroup>(_EnquireTransactionGroup_QNAME, EnquireTransactionGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquireTransactionGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.cds.ws/v1", name = "enquireTransactionGroupResponse")
    public JAXBElement<EnquireTransactionGroupResponse> createEnquireTransactionGroupResponse(EnquireTransactionGroupResponse value) {
        return new JAXBElement<EnquireTransactionGroupResponse>(_EnquireTransactionGroupResponse_QNAME, EnquireTransactionGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquireTxIDsByRoleCd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.cds.ws/v1", name = "enquireTxIDsByRoleCd")
    public JAXBElement<EnquireTxIDsByRoleCd> createEnquireTxIDsByRoleCd(EnquireTxIDsByRoleCd value) {
        return new JAXBElement<EnquireTxIDsByRoleCd>(_EnquireTxIDsByRoleCd_QNAME, EnquireTxIDsByRoleCd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquireTxIDsByRoleCdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.cds.ws/v1", name = "enquireTxIDsByRoleCdResponse")
    public JAXBElement<EnquireTxIDsByRoleCdResponse> createEnquireTxIDsByRoleCdResponse(EnquireTxIDsByRoleCdResponse value) {
        return new JAXBElement<EnquireTxIDsByRoleCdResponse>(_EnquireTxIDsByRoleCdResponse_QNAME, EnquireTxIDsByRoleCdResponse.class, null, value);
    }

}
