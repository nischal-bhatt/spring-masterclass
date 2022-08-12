package com.example.beans;

//simple pojo class
// if you create an object using new keyword, it WONT be a bean. it wont be inside spring context
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
