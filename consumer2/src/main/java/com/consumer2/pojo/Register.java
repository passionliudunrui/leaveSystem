package com.consumer2.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Register {
    private Integer id;
    private String userName;
    private String password;
    private Integer classId;
    private String choice;

}
