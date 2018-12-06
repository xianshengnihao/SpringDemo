package com.spring._06scope;

import org.springframework.beans.factory.FactoryBean;

public class CreationFactoryBean implements FactoryBean {
    public Object getObject() throws Exception {
        return new CreationBean();
    }

    public Class<?> getObjectType() {
        return CreationBean.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
