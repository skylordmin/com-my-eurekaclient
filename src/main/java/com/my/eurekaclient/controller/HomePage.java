package com.my.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @RequestMapping("/")
    public String toString() {
        return "hello,home page!";
    }
}
