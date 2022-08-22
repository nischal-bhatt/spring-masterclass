package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.ARandomBean;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;

public class Example5 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.setName("heya");
        System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName());
        vehicle.printHello();
        
        var rand = context.getBean(ARandomBean.class);
        System.out.println(rand.getNum());
        

    }
}
