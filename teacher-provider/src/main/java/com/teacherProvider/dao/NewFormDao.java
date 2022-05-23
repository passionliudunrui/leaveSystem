package com.teacherProvider.dao;

import com.teacherProvider.entity.NewForm;

import java.util.List;

public interface NewFormDao {
    int insert(NewForm newForm);
    int delete(Integer studentId);
    int update(Integer mystate,Integer studentId);
    List<NewForm>selectAll(Integer classId);
}
