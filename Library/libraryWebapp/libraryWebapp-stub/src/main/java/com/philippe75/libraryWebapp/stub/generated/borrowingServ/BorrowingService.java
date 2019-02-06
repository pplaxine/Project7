
package com.philippe75.libraryWebapp.stub.generated.borrowingServ;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BorrowingService", targetNamespace = "http://borrowing.service.exposure.libraryWS.philippe75.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BorrowingService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.philippe75.libraryWebapp.stub.generated.borrowingServ.ListOfBorrowingDto
     * @throws LibraryServiceException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://borrowing.service.exposure.libraryWS.philippe75.com/BorrowingService/getAllBorrowingForUserRequest", output = "http://borrowing.service.exposure.libraryWS.philippe75.com/BorrowingService/getAllBorrowingForUserResponse", fault = {
        @FaultAction(className = LibraryServiceException_Exception.class, value = "http://borrowing.service.exposure.libraryWS.philippe75.com/BorrowingService/getAllBorrowingForUser/Fault/LibraryServiceException")
    })
    public ListOfBorrowingDto getAllBorrowingForUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws LibraryServiceException_Exception
    ;

}
