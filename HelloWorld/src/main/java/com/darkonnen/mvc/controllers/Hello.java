package com.darkonnen.mvc.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importar las dependencias.
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
// 1. Annotation
@RestController
public class Hello {
        public static void main(String[] args) {
                SpringApplication.run(Hello.class, args);
        }
        
        // 1. Anotación
        @RequestMapping("/")
        // 3. Método que se asigna a la Solicitud anterior.
        public String hello() { // 3
                return "Hello World!";
        }
        
//        https://stackoverflow.com/questions/49275241/spring-boot-2-ajp/49277513
}
