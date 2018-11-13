package com.my.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {


    @RequestMapping(value = "/my")
    public String hello() {
        return "this is the service";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.name="my ";
        user.home="wuhan";
        user.sex="1";
        System.out.println("调用了当前服务");
        return user;
    }

    public class User{

        public String name ;
        public String sex;
        public String home;
    }
}


