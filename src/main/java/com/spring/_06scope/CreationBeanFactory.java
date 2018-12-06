package com.spring._06scope;

public class CreationBeanFactory {
    public static CreationBean getCreation1(){
        return new CreationBean();
    }

    public CreationBean getCreation2(){
        return new CreationBean();
    }
}
