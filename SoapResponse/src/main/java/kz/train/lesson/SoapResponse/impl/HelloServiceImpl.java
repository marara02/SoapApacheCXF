package kz.train.lesson.SoapResponse.impl;

import kz.train.lesson.SoapResponse.HelloService;

import javax.jws.WebService;

@WebService(
            serviceName = "Hello",
            portName = "HelloPort",
            targetNamespace = "http://service.ws.sample/",
            endpointInterface = "kz.train.lesson.SoapResponse.HelloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
