package com.consumer2.controller;

import api.TeacherService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TeacherController {

    @Reference
    private TeacherService teacherService;


    @RequestMapping("selectLeave")
    public ModelAndView handlerLeave(Integer classId){
        ModelAndView mv=new ModelAndView();
        System.out.println("老师处理"+classId+"的请求");
        String ans = teacherService.selectNewForms(classId);
        if(ans.equals("empty")){
            mv.setViewName("teacher");
            return mv;
        }

        else{

            mv.addObject("msg",ans);
            mv.setViewName("teacher2");
            return mv;

        }
    }


    @ResponseBody
    @RequestMapping("handlerLeave")
    public String handlerLeave(Integer studentId,Integer state){
        System.out.println(studentId);
        System.out.println(state);
        String s = teacherService.handlerLeave(studentId, state);
        return "处理成功";
    }



}
