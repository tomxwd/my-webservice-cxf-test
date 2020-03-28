package top.tomxwd.webservice.service;

import javax.jws.WebService;

/**
 * @author xieweidu
 * @createDate 2020-03-28 11:47
 */
@WebService
public interface HelloWorld {

    /**
     * sayhello方法
     *
     * @param name 姓名
     * @param age  年龄
     */
    String sayHello(String name, int age);

}
