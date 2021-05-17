package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/") //retornar a mensagem abaixo no browser
    public String HelloMessage(){
        return "Hello, Springboot!!";
    }
}
