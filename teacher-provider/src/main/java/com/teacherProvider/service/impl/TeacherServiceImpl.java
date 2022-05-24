package com.teacherProvider.service.impl;

import api.TeacherService;
import com.teacherProvider.dao.NewFormDao;
import com.teacherProvider.dao.TeacherDao;
import com.teacherProvider.entity.NewForm;
import com.teacherProvider.entity.Teacher;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private NewFormDao newFormDao;

    @Autowired
    private TeacherDao teacherDao;


    @Override
    public String login(Integer id, String password) {
        Teacher teacher = teacherDao.check(id, password);
        if(teacher!=null){
            return "ok";
        }
        return "false";
    }

    @Override
    public String register(Integer id, String userName, String password, Integer classId) {
        return null;
    }

    @Override
    public String changePassword(String password) {
        return null;
    }

    @Override
    public String handlerLeave(Integer studentId,Integer state) {



        int update = newFormDao.update(state, studentId);
        if(update==1){
            return "ok";
        }
        else if(update==0){
            return "false";
        }

        return null;
    }

    @Override
    public String selectNewForms(Integer classId) {
        List<NewForm> newForms = newFormDao.selectAll(classId);
        String ans="";
        if(newForms.size()==0){
            return "empty";
        }

        else{
            for(NewForm newForm:newForms){
//                ans=newForm.getStudentId()+","+newForm.getClassId()+","+newForm.getReason()+","+newForm.getMystate();
//                ans=ans+";";
                ans=ans+newForm.toString()+";        ";
            }

            return ans;

        }
    }


}
