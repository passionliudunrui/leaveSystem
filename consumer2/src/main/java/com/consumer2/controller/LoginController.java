package com.consumer2.controller;


import api.TeacherService;
import com.api.StudentService;
import com.consumer2.pojo.Login;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Reference
    private StudentService studentService;

    @Reference
    private TeacherService teacherService;

    /**
     * 验证登录请求
     * @param login
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String toLogin(Login login){
        System.out.println(login);
        if(login.getChoice().equals("student")){
            String ans = studentService.login(login.getId(), login.getPassword());
            if(ans.equals("ok")){

                return "welcomeStudent";
            }
            return "login";
        }
        else if(login.getChoice().equals("teacher")){
            System.out.println("11111111111111111111111");
            String ans = teacherService.login(login.getId(), login.getPassword());
            System.out.println(ans);
            System.out.println("2222222222222222222222");
            if(ans.equals("ok")){

                return "welcomeTeacher";
            }
            return "login";
        }

        return "login";
    }

}
