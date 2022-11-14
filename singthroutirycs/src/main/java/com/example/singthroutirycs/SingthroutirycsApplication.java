package com.example.singthroutirycs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SingthroutirycsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingthroutirycsApplication.class, args);
    }

    @GetMapping("/simple-request")
    public String simpleRequest(){
        return "ok";
    }
}
