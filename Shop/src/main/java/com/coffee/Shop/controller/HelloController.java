package com.coffee.Shop.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/Hello")
    public String hello(){
        return "Hello from shop";
    }

}
