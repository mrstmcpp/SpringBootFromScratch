package org.mrstm.springboot.TodoApi;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //declaring this class as aspect
@Component //is an annotation that allows Spring to detect our custom beans automatically.
public class TimeMonitorAspect {

//    @Around("@annotation(TimeMonitor)") /// This is our advice, and around advice means we are adding extra code both before and after method execution.
    @Around("@annotation(TimeMonitor)")
    //Trying before
    public void logTime(ProceedingJoinPoint joinPoint) {
        System.out.println("Logging time");
        long start = System.currentTimeMillis(); //set start time

        try{
        //our methods here
            joinPoint.proceed(); //without this doSomething method will never be call....
// if we comment out above line... loop doesn't run and elapsed time is 0ms. with loop is around 440ms.
        }
        catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            long end = System.currentTimeMillis(); // end time
            long diff = end - start;
            System.out.println("Elapsed time in milliseconds: " + diff);
        }

    }
    //total three ways to run -> Around, Before, and After


}
