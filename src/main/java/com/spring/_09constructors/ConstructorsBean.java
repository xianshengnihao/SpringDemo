package com.spring._09constructors;

public class ConstructorsBean {
    private String name;
    private int anInt;
    private Otherbean otherbean;

    public ConstructorsBean(String name, Otherbean otherbean ,int anInt) {
        this.name = name;
        this.otherbean = otherbean;
        this.anInt = anInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Otherbean getOtherbean() {
        return otherbean;
    }

    public void setOtherbean(Otherbean otherbean) {
        this.otherbean = otherbean;
    }

    public int getAnInt() {
        return anInt;
    }

    @Override
    public String toString() {
        return "ConstructorsBean{" +
                "name='" + name + '\'' +
                ", anInt=" + anInt +
                ", otherbean=" + otherbean +
                '}';
    }
}
