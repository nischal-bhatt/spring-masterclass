package com.example.beans;

import org.springframework.stereotype.Component;

@Component(value="vehicle2")
public class Vehicle2 extends Vehicle{

    public Vehicle2(){
        System.out.println("Vehicle bean created by Spring");
    }
    private String name = "Example11-2";
    //can use postconstruct also

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println(
            "Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}
