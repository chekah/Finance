
package aminParsian.webService.EstelamHoviayat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ISabtInq", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ISabtInq {


    /**
     * 
     * @param username
     * @param req
     * @param password
     * @return
     *     returns parsian.webService.EstelamHoviayat.SabtInqRes
     */
    @WebMethod(operationName = "SubmitInq", action = "http://tempuri.org/ISabtInq/SubmitInq")
    @WebResult(name = "SubmitInqResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SubmitInq", targetNamespace = "http://tempuri.org/", className = "parsian.webService.EstelamHoviayat.SubmitInq")
    @ResponseWrapper(localName = "SubmitInqResponse", targetNamespace = "http://tempuri.org/", className = "parsian.webService.EstelamHoviayat.SubmitInqResponse")
    public SabtInqRes submitInq(
        @WebParam(name = "req", targetNamespace = "http://tempuri.org/")
        CiiPersonInfo req,
        @WebParam(name = "Username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param username
     * @param req
     * @param password
     * @return
     *     returns parsian.webService.EstelamHoviayat.SabtInqRes
     */
    @WebMethod(operationName = "SubmitInqDteSts", action = "http://tempuri.org/ISabtInq/SubmitInqDteSts")
    @WebResult(name = "SubmitInqDteStsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SubmitInqDteSts", targetNamespace = "http://tempuri.org/", className = "parsian.webService.EstelamHoviayat.SubmitInqDteSts")
    @ResponseWrapper(localName = "SubmitInqDteStsResponse", targetNamespace = "http://tempuri.org/", className = "parsian.webService.EstelamHoviayat.SubmitInqDteStsResponse")
    public SabtInqRes submitInqDteSts(
        @WebParam(name = "req", targetNamespace = "http://tempuri.org/")
        CiiPersonInfo req,
        @WebParam(name = "Username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        String password);

}