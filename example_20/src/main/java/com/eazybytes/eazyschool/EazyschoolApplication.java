package com.eazybytes.eazyschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EazyschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazyschoolApplication.class, args);
	}

}

/*
 *  what is spring mvc? 
 *  what exactly it is doing when someone sends a request to the web application
 *  how is it identifying what controller to invoke?
 *  what method to invoke ? 
 *  what is mvc pattern ?
 *  1. model        - data of application
 *  2. view         - ui
 *  3. controller   - controls the flow 
 *  achieve loose coupling
 *  
 *  spring mvc internal architecture
 *  1. web client sends request to backend 
 *  2. tomcat server takes the request
 *  3. it will convert http request to servlet request 
 *  4. tomcat hands over that servlet request to dispatcher servlet
 *  5. this dispatcher servlet will be handled by autoconfig
 *  6. it will ask controller handler which controller to invoke
 *  7. controller will return to dispatcher servlet what view to invoke
 *  8. dispatcher servlet then calls view resolver to get he view and pass back to the web client
 *  
 * */
