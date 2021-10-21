package com.example.demo.heroku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HerokuController {
	@GetMapping
    public String hello() {
        return "Welcome to Heroku1";
    }

}
