package com.spring_02._01annIocDI;

public class SomeBean {
    private OtherBean otherBean;
    private FooBean fooBean;

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public FooBean getFooBean() {
        return fooBean;
    }

    public void setFooBean(FooBean fooBean) {
        this.fooBean = fooBean;
    }
}
