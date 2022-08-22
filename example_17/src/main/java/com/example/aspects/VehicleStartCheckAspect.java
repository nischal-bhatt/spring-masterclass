package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
// aspect oriented programming - you basically want to execute a piece of code before or around a method
// 
public class VehicleStartCheckAspect {

    private Logger logger = Logger.getLogger(VehicleStartCheckAspect.class.getName());

    @Before("execution(* com.example.services.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
         logger.info("this is going to run before the method");
    	if(!vehicleStarted){
            throw new RuntimeException("Vehicle not started");
        }
    }
}
