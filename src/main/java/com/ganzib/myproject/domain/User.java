package com.ganzib.myproject.domain;

/**
 * Created by GanZiB on 16/11/29.
 */
public class User {
    public Long id;
    public String name;
    public Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}