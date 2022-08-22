package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10 {

    public static void main(String[] args) {

    	//spring
    	//springboot
    	//jpa
    	//hibernate
    	
    	/*
    	 *  what is spring
    	 *  spring vs java ee
    	 *  evolution of spring
    	 *  spring releases
    	 *  different spring projects
    	 *  
    	 *  spring core
    	 *  IOC, AOP, DI etc etc 
    	 *  
    	 *  spring mvc
    	 *  thymeleaf - 
    	 *  
    	 *  what is spring boot ? what is the diff between spring boot and springmvc
    	 *  autoconfigs etc
    	 *  
    	 *  spring security 
    	 *  spring jdbc
    	 *  spring data
    	 *  spring rest
    	 *  logging
    	 *  properties and profiles
    	 *  spring boot actuator
    	 *  
    	 *  sample web application - school 
    	 *  school - very close to our hearts 
    	 *  
    	 *  pdf of the course - 
    	 *  github.com/eazybytes/spring - 50 example projects
    	 *  there will be pdf for the course - notes
    	 *  
    	 */
    	
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
       // Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
       // System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());

    }
}
