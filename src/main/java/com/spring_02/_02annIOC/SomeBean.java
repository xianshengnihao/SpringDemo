package com.spring_02._02annIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Component @Repository @Controller @Service 四个注解的功能完全一样都是用来标识需要被spring管理的bean
 * @Servixce 用于标注业务层组件
 * @Controller 用于标注控制层组件
 * @Repository 用于标注数据访问层组件（DAO层）
 * @Component 泛指组件，当该bean不好被归类的时候用该注解
 * @Scope 该注解不写默认bean的创建为单例。
 * @PostConstruct 初始化方法注解
 * @PreDestroy 销毁方法注解，scope类型为prototype的时候没有销毁工作
 */
@Component          //加了该注解spring在扫包的时候就会在容器中自动创建该bean
@Scope("singleton")
public class SomeBean {
    /**
     * 使用@Autowired注解方式进行依赖注入的时候
     * @Autowired可以写在属性上，也可写在对应的set方法上
     *
     */

    @Autowired(required = false)    //假如该bean不一定需要通过spring容器创建则将其设置为required即可。默认不写required=true
    private OtherBean otherBean;

    @PostConstruct                      //初始化方法注解
    public void init(){
        System.out.println("初始化工作");
    }
    @PreDestroy                     //销毁方法注解
    public void destroy(){
        System.out.println("销毁工作");
    }
    public OtherBean getOtherBean() {
        return otherBean;
    }


    @Override
    public String toString() {
        return "SomeBean{" +
                "otherBean=" + otherBean +
                ", fooBean=" +
                '}';
    }
}
