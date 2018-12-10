package com.spring.test;

import com.spring.service.IHelloService;
import com.spring.service.Impl.HelloServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class HelloTestImpl {


    @Test
    public void HelloService(){
        IHelloService helloService = new HelloServiceImpl();
        helloService.sayHi();


    }
    /**
     * 从beanFactory中拿bean的四种方式
     * 1、通过id取bean  getBean(id);
     * 2、通过name取bean    getBean(name);
     * 3、通过接口名拿bean     需要spring容器中bean类型唯一
     * 4、通过那么和接口拿bean   getBean(String name,Class Type)
     * 在配置文件中id和name，ID唯一 name可以有别名，一般使用ID
     * bean只对象
     */
    @Test
    public void HelloTest(){
        //从classpath加载配置文件
        Resource resource = new ClassPathResource("applictionContext.xml");
        //创建spring核心容器将helloservice的创建交给了Spring
        BeanFactory factory = new XmlBeanFactory(resource);
        //从容器中根据ID拿bean
        IHelloService helloService = (IHelloService) factory.getBean("helloService");
        //容器中根据name拿bean
        IHelloService helloService2 = (IHelloService) factory.getBean("Hello");
        //从容器中根据接口拿bean
        IHelloService helloService3 = factory.getBean(IHelloService.class);
        helloService.sayHi();
        System.out.printf("\n");
        helloService2.sayHi();
        System.out.printf("\n");
        helloService3.sayHi();
    }
}
