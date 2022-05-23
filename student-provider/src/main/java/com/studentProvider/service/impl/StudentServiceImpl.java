package com.studentProvider.service.impl;

import com.api.StudentService;
import com.studentProvider.dao.StudentDao;
import com.studentProvider.entity.Student;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public String login(Integer id, String password) {
        return null;
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
        System.out.println(id);
        System.out.println(userName);
        System.out.println(classId);
        System.out.println(reason);
        System.out.println("受到消息");
        return "okk";
    }

    @Override
    public String viewResult() {
        return null;
    }

    @Override
    public String removeLeave() {
        return null;
    }
}
