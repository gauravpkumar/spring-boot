package com.netease.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netease.meta.Person;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "Hello world!";
    }

    @RequestMapping("/person")
    public Person getPerson(){
        return new Person("Max", 10, "15 street");
    }
}
