package com.teacherProvider.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class NewForm {
    //private Integer id;
    private Integer studentId;
    private Integer classId;
    private String reason;
    private Integer mystate;
    private Integer myresult;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getMystate() {
        return mystate;
    }

    public void setMystate(Integer mystate) {
        this.mystate = mystate;
    }

    public Integer getMyresult() {
        return myresult;
    }

    public void setMyresult(Integer myresult) {
        this.myresult = myresult;
    }

    @Override
    public String toString() {
        return "请假单{" +
                "studentId=" + studentId +
                ", classId=" + classId +
                ", reason='" + reason + '\'' +
                ", mystate=" + mystate +
                ", myresult=" + myresult +
                '}';
    }
}
