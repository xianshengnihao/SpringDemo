package com.spring_03.spring_jdbc;

import org.springframework.stereotype.Component;

/**
 * @Author: hwg
 * @Date: Create in 2019/7/2
 */
public class Project {
   private Long id;
   private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
