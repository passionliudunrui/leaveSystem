package com.studentProvider.dao;

import com.studentProvider.entity.NewForm;

public interface NewFormDao {
    int insert(NewForm newForm);
    int delete(Integer studentId);
    int update(Integer mystate,Integer studentId);
    NewForm select(Integer studentId);
}
