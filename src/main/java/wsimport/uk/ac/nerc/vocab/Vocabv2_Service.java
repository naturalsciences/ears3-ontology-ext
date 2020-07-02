
package wsimport.uk.ac.nerc.vocab;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "vocabv2", targetNamespace = "http://vocab.nerc.ac.uk", wsdlLocation = "http://vocab.nerc.ac.uk/vocab2.wsdl")
public class Vocabv2_Service
    extends Service
{

    private final static URL VOCABV2_WSDL_LOCATION;
    private final static WebServiceException VOCABV2_EXCEPTION;
    private final static QName VOCABV2_QNAME = new QName("http://vocab.nerc.ac.uk", "vocabv2");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://vocab.nerc.ac.uk/vocab2.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VOCABV2_WSDL_LOCATION = url;
        VOCABV2_EXCEPTION = e;
    }

    public Vocabv2_Service() {
        super(__getWsdlLocation(), VOCABV2_QNAME);
    }

    public Vocabv2_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VOCABV2_QNAME, features);
    }

    public Vocabv2_Service(URL wsdlLocation) {
        super(wsdlLocation, VOCABV2_QNAME);
    }

    public Vocabv2_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VOCABV2_QNAME, features);
    }

    public Vocabv2_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Vocabv2_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Vocabv2
     */
    @WebEndpoint(name = "vocabv2SOAP")
    public Vocabv2 getVocabv2SOAP() {
        return super.getPort(new QName("http://vocab.nerc.ac.uk", "vocabv2SOAP"), Vocabv2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Vocabv2
     */
    @WebEndpoint(name = "vocabv2SOAP")
    public Vocabv2 getVocabv2SOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://vocab.nerc.ac.uk", "vocabv2SOAP"), Vocabv2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VOCABV2_EXCEPTION!= null) {
            throw VOCABV2_EXCEPTION;
        }
        return VOCABV2_WSDL_LOCATION;
    }

}
