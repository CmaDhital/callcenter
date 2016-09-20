
package com.cubic.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cubic.soap.service package. 
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

    private final static QName _CustomerServiceRequest_QNAME = new QName("http://com.cubic.net/customerservice/1.0", "CustomerServiceRequest");
    private final static QName _CustomerServiceResponse_QNAME = new QName("http://com.cubic.net/customerservice/1.0", "CustomerServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cubic.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerServiceRequestType }
     * 
     */
    public CustomerServiceRequestType createCustomerServiceRequestType() {
        return new CustomerServiceRequestType();
    }

    /**
     * Create an instance of {@link CustomerServiceResponseType }
     * 
     */
    public CustomerServiceResponseType createCustomerServiceResponseType() {
        return new CustomerServiceResponseType();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.cubic.net/customerservice/1.0", name = "CustomerServiceRequest")
    public JAXBElement<CustomerServiceRequestType> createCustomerServiceRequest(CustomerServiceRequestType value) {
        return new JAXBElement<CustomerServiceRequestType>(_CustomerServiceRequest_QNAME, CustomerServiceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.cubic.net/customerservice/1.0", name = "CustomerServiceResponse")
    public JAXBElement<CustomerServiceResponseType> createCustomerServiceResponse(CustomerServiceResponseType value) {
        return new JAXBElement<CustomerServiceResponseType>(_CustomerServiceResponse_QNAME, CustomerServiceResponseType.class, null, value);
    }

}
