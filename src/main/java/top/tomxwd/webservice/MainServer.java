package top.tomxwd.webservice;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import top.tomxwd.webservice.service.impl.HelloWorldImpl;

/**
 * @author xieweidu
 * @createDate 2020-03-28 11:53
 */
public class MainServer {

    public static void main(String[] args) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        // 对外暴露地址
        jaxWsServerFactoryBean.setAddress("http://localhost:9999/cxftest");
        // 提供服务的实现类
        jaxWsServerFactoryBean.setServiceClass(HelloWorldImpl.class);
        // 构建出来的服务
        Server server = jaxWsServerFactoryBean.create();
        // 启动服务
        server.start();
    }

}
