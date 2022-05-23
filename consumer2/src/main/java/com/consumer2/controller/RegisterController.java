package com.consumer2.controller;

import com.api.StudentService;
import com.consumer2.pojo.Register;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

    @Reference
    private StudentService studentService;


    @RequestMapping("/register")
    public String register(){

        return "register";
    }

    @ResponseBody
    @RequestMapping("/toRegister")
    public String toRegister(Register register){

        String register1 = studentService.register(register.getId(), register.getUserName(), register.getPassword(), register.getClassId());

        if(register1.equals("ok")){
            return "注册成功";
        }

        return "注册失败";
    }
}
