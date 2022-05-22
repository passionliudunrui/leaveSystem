package com.teacherProvider.dao;

import com.teacherProvider.entity.Teacher;

import java.util.List;

public interface TeacherDao {

    Teacher check(Integer id,String password);
    List<Teacher> findAll();
}
