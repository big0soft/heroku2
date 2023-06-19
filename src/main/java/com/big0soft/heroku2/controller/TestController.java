package com.big0soft.heroku2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class TestController {
    @GetMapping
    public String gretting() {
        return "gretting";
    }
}
