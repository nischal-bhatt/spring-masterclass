package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"/home","/",""})
    public String displayHomePage() {
    	System.out.println("now in display home page method");
        return "testing.html";
    }

}
