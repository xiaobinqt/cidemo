package com.xiicloud.demo.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Guest {

    private String name;

    private String sex;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public Guest(String sex) {
        this.sex = sex;
    }
}
