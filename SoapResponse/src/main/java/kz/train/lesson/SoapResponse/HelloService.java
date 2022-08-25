package kz.train.lesson.SoapResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://service.ws.sample/",
            name = "HelloService")
public interface HelloService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(
                    localName = "sayHello",
                    targetNamespace = "http://service.ws.sample/",
                    className = "sample.ws.service.RequestSayHello")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(
                     localName = "sayHelloResponse",
                     targetNamespace = "http://service.ws.sample/",
                     className = "sample.ws.service.SayHelloResponse")
    String sayHello(@WebParam(name = "name", targetNamespace = "") String name);
}
