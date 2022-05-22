package com.consumer2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String register(){

        return "register";
    }

    @ResponseBody
    @RequestMapping("/toRegister")
    public String toRegister(){


        System.out.println("注册成功");
        return "注册成功 ";
    }
}
