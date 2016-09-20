
package com.cubic.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerServicePortType", targetNamespace = "http://com.cubic.net/customerservice/1.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerServicePortType {


    /**
     * 
     * @param customerServiceRequest
     * @return
     *     returns com.cubic.soap.service.CustomerServiceResponseType
     */
    @WebMethod(action = "http://com.cubic.net/CustomerService/getCustomer")
    @WebResult(name = "CustomerServiceResponse", targetNamespace = "http://com.cubic.net/customerservice/1.0", partName = "CustomerServiceResponse")
    public CustomerServiceResponseType searchCustomer(
        @WebParam(name = "CustomerServiceRequest", targetNamespace = "http://com.cubic.net/customerservice/1.0", partName = "CustomerServiceRequest")
        CustomerServiceRequestType customerServiceRequest);

}