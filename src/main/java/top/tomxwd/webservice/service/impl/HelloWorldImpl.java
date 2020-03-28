package top.tomxwd.webservice.service.impl;

import top.tomxwd.webservice.service.HelloWorld;

/**
 * @author xieweidu
 * @createDate 2020-03-28 11:48
 */
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHello(String name, int age) {
        return "cxf hello world " + name + "\t" + age;
    }

}
