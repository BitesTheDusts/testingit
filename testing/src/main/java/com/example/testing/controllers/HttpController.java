package com.example.testing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/world")
public class HttpController {

    @Value("$(master.username)")
    private String username;
    
    @GetMapping(value = "/username")
    public String UserController() {
        return username;
    }
    
}
