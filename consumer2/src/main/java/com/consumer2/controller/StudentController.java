package com.consumer2.controller;

import com.api.StudentService;
import com.consumer2.pojo.Leave;
import com.consumer2.pojo.RemoveLeave;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {


    @Reference
    private StudentService studentService;

    /**
     * 处理学生的请求
     */

    @RequestMapping(value = "/toLeave",method = RequestMethod.POST)
    public String toLeave(Leave leave){
        System.out.println(leave);

        String s = studentService.toLeave(leave.getId(), leave.getUserName(), leave.getClassId(), leave.getReason());

        System.out.println(s);

        return "index";

    }

    @RequestMapping(value = "/viewResult",method = RequestMethod.POST)
    public String viewResult(Integer id){

        System.out.println(id);

        return "index";

    }

    @RequestMapping(value = "/removeLeave",method = RequestMethod.POST)
    public String removeLeave(RemoveLeave removeLeave){
        System.out.println(removeLeave);

        return "index";

    }
}
