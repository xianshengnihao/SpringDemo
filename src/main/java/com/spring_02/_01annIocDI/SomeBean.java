package com.spring_02._01annIocDI;

import org.springframework.beans.factory.annotation.Autowired;

public class SomeBean {
    /**
     * 使用@Autowired注解方式进行依赖注入的时候
     * @Autowired可以写在属性上，也可写在对应的set方法上
     *
     */

    @Autowired(required = false)    //假如该bean不一定需要通过spring容器创建则将其设置为required即可。默认不写required=true
    private OtherBean otherBean;
    @Autowired
    private FooBean fooBean;

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public FooBean getFooBean() {
        return fooBean;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "otherBean=" + otherBean +
                ", fooBean=" + fooBean +
                '}';
    }
}
