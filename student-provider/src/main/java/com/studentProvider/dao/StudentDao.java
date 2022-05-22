package com.studentProvider.dao;

import com.studentProvider.entity.Student;

import java.util.List;

public interface StudentDao {
    Student check(Integer id,String password);
    List<Student>findAll();

}
