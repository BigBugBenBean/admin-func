
package util.itifwk.immd.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the util.itifwk.immd.v1 package. 
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

    private final static QName _ITISysException_QNAME = new QName("http://immd.itifwk.util/v1", "ITISysException");
    private final static QName _ITIAppException_QNAME = new QName("http://immd.itifwk.util/v1", "ITIAppException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: util.itifwk.immd.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ITISysException }
     * 
     */
    public ITISysException createITISysException() {
        return new ITISysException();
    }

    /**
     * Create an instance of {@link ITIAppException }
     * 
     */
    public ITIAppException createITIAppException() {
        return new ITIAppException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ITISysException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.itifwk.util/v1", name = "ITISysException")
    public JAXBElement<ITISysException> createITISysException(ITISysException value) {
        return new JAXBElement<ITISysException>(_ITISysException_QNAME, ITISysException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ITIAppException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://immd.itifwk.util/v1", name = "ITIAppException")
    public JAXBElement<ITIAppException> createITIAppException(ITIAppException value) {
        return new JAXBElement<ITIAppException>(_ITIAppException_QNAME, ITIAppException.class, null, value);
    }

}
