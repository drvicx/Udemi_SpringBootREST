package ru.nve.springboot.examples.demoApp1.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

/**
 *=ПРОСТОЙ ДЕМОНСТРАЦИОННЫЙ REST КОНТРОЛЛЕР
 */
@RestController
public class MyRestController {

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String getHello() {
        return "Hello from webapp! Server time is " + LocalDateTime.now();
    }
}
