package ru.nve.springboot.examples.demoApp1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

/**
 *=JUST SIMPLE DEMO REST-CONTROLLER
 */
@RestController
public class MyRestController {

    //--read var value from application.properties
    @Value("${app.greet}")
    private String greetMsg;

    @Value("${info.app.name}")
    private String app_name;

    @Value("${my.config.admin.name}")
    private String admin_name;

    @Value("${my.config.admin.email}")
    private String admin_email;


    //--site root ("/")
    @GetMapping("")
    public String getHello() {

        //--initial value
        //return "Hello from webapp! Server time is " + LocalDateTime.now();

        //--add value from application.properties
        //return LocalDateTime.now() + ": " + greetMsg;

        //--JSON output (RFC 8259)
        return "[{ \"serverTime\": \"" + LocalDateTime.now() + "\", \"serverMsg\": \"" + greetMsg + "\", \"appName\": \"" + app_name + "\", \"serverAdmin\": \"" + admin_name + "\", \"adminMail\": \"" + admin_email + "\" }]";
    }

    //--new endpoint
    @GetMapping("test")
    public String getTest() {
        return "[{\"msg\": \"TEST\"}]";
    }
}
