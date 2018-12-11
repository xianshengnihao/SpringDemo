package com.spring_01._06scope;

import org.springframework.beans.factory.FactoryBean;

public class CreationFactoryBean implements FactoryBean {
    //创建CreationBean对象
    public Object getObject() throws Exception {
        return new CreationBean();
    }
    //返回CreationBean类型
    public Class<?> getObjectType() {
        return CreationBean.class;
    }
    //是否单例
    public boolean isSingleton() {
        return true;
    }
}
