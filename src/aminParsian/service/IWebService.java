package aminParsian.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName = "DarmanWebService" )
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public interface IWebService {
    public static final String SERVICE_NAME = "webService";


    @WebMethod(operationName = "createCredebit")
    public String createCredebit(String input);

    @WebMethod(operationName = "ersalBeSafePardakht")
    public String ersalBeSafePardakht(String input);

}
