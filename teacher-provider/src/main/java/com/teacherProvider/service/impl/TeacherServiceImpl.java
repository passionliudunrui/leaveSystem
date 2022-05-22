package com.teacherProvider.service.impl;

import api.TeacherService;
import org.apache.dubbo.config.annotation.Service;


@Service
public class TeacherServiceImpl implements TeacherService {
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
    public String handlerLeave() {
        return null;
    }
}
