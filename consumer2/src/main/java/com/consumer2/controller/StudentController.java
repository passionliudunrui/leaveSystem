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

        if(s.equals("ok")){
            return "leaveOk";
        }
        else if(s.equals("false")){

            return "leaveFalse";
        }
        return "index";
    }

    @RequestMapping(value = "/viewResult",method = RequestMethod.POST)
    public String viewResult(Integer id){

        String s = studentService.viewResult(id);
        if(s.equals("ok")){
            return "leaveOk2";

        }
        else if(s.equals("false")){
            return "leaveFalse2";

        }
        else if(s.equals("wait")){
            return "leaveFalse3";
        }

        return "index";
    }

    @RequestMapping(value = "/removeLeave",method = RequestMethod.POST)
    public String removeLeave(RemoveLeave removeLeave){
        String s = studentService.removeLeave(removeLeave.getId());
        if(s.equals("ok")){
            return "removeLeaveOk";
        }
        else if(s.equals("false")){

            return "removeLeaveFalse";
        }

        return "index";

    }


    @RequestMapping("thanks")
    public String  thanks(Integer id){

        studentService.removeLeave(id);
        System.out.println(id);
        return "welcomeStudent";

    }

}
