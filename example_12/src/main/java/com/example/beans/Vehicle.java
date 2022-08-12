package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {

    private String name;
// commented code below will cause circular dependencies
   // private Person person;
    
  //  public Person getPerson()
   // {
   // 	return this.person;
   // }
    
    //@Autowired
    //public void setPerson(Person person)
   // {
   // 	this.person = person;
   // }
    
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
