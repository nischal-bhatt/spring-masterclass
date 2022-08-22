package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example8 {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean("vehicle2",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getShit());

        Vehicle vehi = context.getBean("vehicle3",Vehicle.class);
        System.out.println(vehi.getShit());
        
        Vehicle v = context.getBean(Vehicle.class);
        System.out.println(v.getShit());
    }
}
