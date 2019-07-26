package com.ThreadTest;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Date;

public class ClassLoder {


    public static <T> T getInstance(Class<T> bean){
        try {
            return bean.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("00000000");
        String c = "0";
        c.compareTo(b.toString());
        System.out.println();
//        Date d = ClassLoder.getInstance(Date.class);
//        Object o = Array.newInstance(String.class,10);


    }
}
