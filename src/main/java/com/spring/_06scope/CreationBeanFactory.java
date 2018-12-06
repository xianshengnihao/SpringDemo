package com.spring._06scope;

public class CreationBeanFactory {
    /**
     * 通过静态方法创建
     * @return
     */
    public static CreationBean getCreation1(){
        return new CreationBean();
    }

    /**
     * 通过普通方法创建
     * @return
     */
    public CreationBean getCreation2(){
        return new CreationBean();
    }
}
