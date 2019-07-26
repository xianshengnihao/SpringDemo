package com.ThreadTest;

import java.util.*;

/**
 * @Author: hwg
 * @Date: Create in 2019/4/24
 */
public class TestNg {
    public static void main(String[] args) {
//        String stc = null;
//        String[] stb={};
//        Collection ll = new ArrayList();
//        ll.add("321");
//        ll.add("21");
//        ll.add("65532");
//        ll.forEach(src -> System.out.println("Lambda表达式forEach遍历集合元素"+src));
//        Iterator it = ll.iterator();
//        it.forEachRemaining(srv-> System.out.println("使用迭代器的Lambda表达式forEach遍历集合元素"+srv));
//        while(it.hasNext()){
//            stc = (String) it.next();
//            System.out.println(stc);
//        }
        SetTest();
        Iterator it = SetTest().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


    public static Set SetTest(){
        Set set = new HashSet();
        set.add("11");
        set.add("11");
        return set;
    }
}
