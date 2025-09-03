package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
     @GetMapping("/")
     public String get() {
         return "Hello Sandeep";
     }
}
