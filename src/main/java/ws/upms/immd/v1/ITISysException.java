
package ws.upms.immd.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-05T16:41:14.910+08:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "ITISysException", targetNamespace = "http://immd.itifwk.util/v1")
public class ITISysException extends Exception {
    
    private util.itifwk.immd.v1.ITISysException itiSysException;

    public ITISysException() {
        super();
    }
    
    public ITISysException(String message) {
        super(message);
    }
    
    public ITISysException(String message, Throwable cause) {
        super(message, cause);
    }

    public ITISysException(String message, util.itifwk.immd.v1.ITISysException itiSysException) {
        super(message);
        this.itiSysException = itiSysException;
    }

    public ITISysException(String message, util.itifwk.immd.v1.ITISysException itiSysException, Throwable cause) {
        super(message, cause);
        this.itiSysException = itiSysException;
    }

    public util.itifwk.immd.v1.ITISysException getFaultInfo() {
        return this.itiSysException;
    }
}
