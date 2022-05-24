package com.studentProvider.service.impl;

import com.api.StudentService;
import com.studentProvider.dao.NewFormDao;
import com.studentProvider.dao.OldFormDao;
import com.studentProvider.dao.StudentDao;
import com.studentProvider.entity.NewForm;
import com.studentProvider.entity.OldForm;
import com.studentProvider.entity.Student;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private NewFormDao newFormDao;

    @Autowired
    private OldFormDao oldFormDao;

    @Override
    public String login(Integer id, String password) {

        Student student = studentDao.check(id, password);
        if(student!=null){
            return "ok";
        }
        return "false";

    }

    @Override
    public String register(Integer id, String userName, String password, Integer classId) {
        System.out.println("接收到注册请求");
        Student student=new Student(id,userName,password,classId);
        int insert = studentDao.insert(student);
        System.out.println(insert);
        if(insert==1){
            return "ok";
        }
        return "false";
    }

    @Override
    public String changePassword(String password) {
        return null;
    }

    @Override
    public String toLeave(Integer id, String userName, Integer classId, String reason) {
        NewForm newForm=new NewForm(id,classId,reason,0,0);
        int insert = newFormDao.insert(newForm);
        if(insert==1){
            return "ok";
        }
        return "false";
    }

    @Override
    public String viewResult(Integer id) {
        NewForm newForm = newFormDao.select(id);
        if(newForm.getMystate()==0){

            return "wait";
        }
        else if(newForm.getMystate()==1){
            return "ok";
        }
        else if(newForm.getMystate()==2){
            return "false";
        }
        return null;
    }

    @Override
    public String removeLeave(Integer studentId) {

        NewForm newForm=newFormDao.select(studentId);

        OldForm oldForm=new OldForm();
        oldForm.setStudentId(newForm.getStudentId());
        oldForm.setClassId(newForm.getClassId());
        oldForm.setMyresult(newForm.getMyresult());

        int delete = newFormDao.delete(studentId);
        int insert = oldFormDao.insert(oldForm);


        if(delete+insert==2){

            return "ok";
        }
        return "false";
    }
}
