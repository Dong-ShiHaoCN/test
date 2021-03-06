package com.qf.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringbootApplication.class, args);
    }

    @RestController
    public class TestController {

        @GetMapping("/test")
        public String test(){
            return "Hello SpringBoot!";
        }

    }


}

