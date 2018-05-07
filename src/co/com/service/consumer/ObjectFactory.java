
package co.com.service.consumer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.service.consumer package. 
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

    private final static QName _GreetingWithName_QNAME = new QName("http://consumer.service.com.co/", "greetingWithName");
    private final static QName _GreetingWithNameResponse_QNAME = new QName("http://consumer.service.com.co/", "greetingWithNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.service.consumer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GreetingWithNameResponse }
     * 
     */
    public GreetingWithNameResponse createGreetingWithNameResponse() {
        return new GreetingWithNameResponse();
    }

    /**
     * Create an instance of {@link GreetingWithName }
     * 
     */
    public GreetingWithName createGreetingWithName() {
        return new GreetingWithName();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingWithName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consumer.service.com.co/", name = "greetingWithName")
    public JAXBElement<GreetingWithName> createGreetingWithName(GreetingWithName value) {
        return new JAXBElement<GreetingWithName>(_GreetingWithName_QNAME, GreetingWithName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingWithNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://consumer.service.com.co/", name = "greetingWithNameResponse")
    public JAXBElement<GreetingWithNameResponse> createGreetingWithNameResponse(GreetingWithNameResponse value) {
        return new JAXBElement<GreetingWithNameResponse>(_GreetingWithNameResponse_QNAME, GreetingWithNameResponse.class, null, value);
    }

}
