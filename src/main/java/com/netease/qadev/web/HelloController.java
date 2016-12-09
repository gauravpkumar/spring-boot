package com.netease.qadev.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzyanyaqiang on 16-12-9.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Hello world!";
    }


}
