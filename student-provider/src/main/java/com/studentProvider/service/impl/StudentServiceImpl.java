package com.studentProvider.service.impl;

import com.api.StudentService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String login(Integer id, String password) {
        return null;
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
    public String toLeave(Integer id, String userName, Integer classId, String reason) {
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
