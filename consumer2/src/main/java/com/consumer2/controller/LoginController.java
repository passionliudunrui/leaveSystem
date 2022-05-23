package com.consumer2.controller;


import com.consumer2.pojo.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    /**
     * 验证登录请求
     * @param login
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String toLogin(Login login){
        System.out.println(login);
        if(login.getChoice().equals("student")){
            return "welcomeStudent";
        }
        else if(login.getChoice().equals("teacher")){
            return "welcomeTeacher";
        }

        return "login";
    }

}
