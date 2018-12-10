package com.spring._08DI;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SomeBean {
    private String value;
    private Integer number;
    private URL url;
    private OtherBean otherBean;
    private List list;
    private Set set;
    private Map map;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public OtherBean getOtherBean() {
        return otherBean;
    }

    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "value='" + value + '\'' +
                ", number=" + number +
                ", url=" + url +
                ", otherBean=" + otherBean +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
