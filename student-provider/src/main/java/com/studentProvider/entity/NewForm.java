package com.studentProvider.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/**
 * state的状态      0学生请假但是老师未处理      1老师同意请假但是没有销假     2已经销假
 * result的状态     1请假成功   0请假失败
 */

public class NewForm {
//    private Integer id;
    private Integer studentId;
    private Integer classId;
    private String reason;
    private Integer mystate;
    private Integer myresult;

}
