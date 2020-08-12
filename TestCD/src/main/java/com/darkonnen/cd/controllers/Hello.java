package com.darkonnen.cd.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
        
        @RequestMapping("/")
        public String hello() { // 3
                return "Hello World!";
        }
        
//        https://stackoverflow.com/questions/49275241/spring-boot-2-ajp/49277513
}
