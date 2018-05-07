package co.com.service.consumer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2018-05-05T12:49:15.020-05:00
 * Generated source version: 2.4.2
 * 
 */
@WebServiceClient(name = "GreetingImplService", 
                  wsdlLocation = "file:/Users/johanbeltran/Documents/workspace/SampleClient/WebContent/wsdl/greetingimpl.wsdl",
                  targetNamespace = "http://consumer.service.com.co/") 
public class GreetingImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://consumer.service.com.co/", "GreetingImplService");
    
    
    public final static QName GreetingImplPort = new QName("http://consumer.service.com.co/", "GreetingImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/johanbeltran/Documents/workspace/SampleClient/WebContent/wsdl/greetingimpl.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GreetingImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/johanbeltran/Documents/workspace/SampleClient/WebContent/wsdl/greetingimpl.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GreetingImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GreetingImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GreetingImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GreetingImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GreetingImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public GreetingImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IGreeting
     */
    @WebEndpoint(name = "GreetingImplPort")
    public IGreeting getGreetingImplPort() {
        return super.getPort(GreetingImplPort, IGreeting.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IGreeting
     */
    @WebEndpoint(name = "GreetingImplPort")
    public IGreeting getGreetingImplPort(WebServiceFeature... features) {
        return super.getPort(GreetingImplPort, IGreeting.class, features);
    }

}
