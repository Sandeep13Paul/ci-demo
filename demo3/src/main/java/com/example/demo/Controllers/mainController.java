package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
     @GetMapping("/")
     public String get() {
         System.out.println("Hello Sandeep");
         return "Hello World Sandeep";
     }

     @GetMapping("/hello")
     public String hello() {
        return "Hello from /hello endpoint!";
     }

     @GetMapping("/greet")
     public String greet() {
        return "Greetings from /greet endpoint!";
     }

     @GetMapping("/paid")
     public String paid() {
        return "Greetings from /paid endpoint!";
     }
}
