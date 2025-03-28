package org.mrstm.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")        //getmapping takes a method to return the response;
    //@GetMapping can only be applied to methods, not classes or fields.
    public String hello() {
        return "<b>Hey, this is the home page</b>";
    }

    @GetMapping("/mrstm")
    public String mrstm() { //this method name should be same as page name
        return "<b>Hey, this is the mrstm page</b>";
    }


//    String hello = "Hey this is homePage"; // this will not work
}
