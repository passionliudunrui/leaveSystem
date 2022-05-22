package com.teacherProvider.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    private Integer id;
    private String userName;
    private String password;
    private Integer classId;

}
