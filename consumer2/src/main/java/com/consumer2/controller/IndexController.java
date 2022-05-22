package com.consumer2.controller;

import com.consumer2.pojo.Leave;
import com.consumer2.pojo.Login;
import com.consumer2.pojo.RemoveLeave;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    /**
     * 访问主页
     * @return
     */
    @RequestMapping("/")
    public String index(){

        System.out.println("有人访问");

        return "login";
    }

    /**
     * 验证登录请求
     * @param login
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String toLogin(Login login){
        System.out.println(login.getId());
        System.out.println(login.getPassword());
        System.out.println(login.getChoice());
        System.out.println("111");

        return "welcomeStudent";
    }

    /**
     * 处理学生的请求
     */

    @RequestMapping(value = "/toLeave",method = RequestMethod.POST)
    public String toLeave(Leave leave){
        System.out.println(leave);

        return "index";

    }

    @RequestMapping(value = "/viewResult",method = RequestMethod.POST)
    public String viewResult(Integer id){

        System.out.println(id);
        System.out.println("接收到请求");

        return "index";

    }

    @RequestMapping(value = "/removeLeave",method = RequestMethod.POST)
    public String removeLeave(RemoveLeave removeLeave){
        System.out.println(removeLeave);
        System.out.println("接收到请求");

        return "index";

    }


}
