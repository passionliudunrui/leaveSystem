package com.api;

public interface StudentService {
    String login(Integer id,String password);
    String register(Integer id,String userName,String password,Integer classId);
    String changePassword(String password);
    String toLeave(Integer id,String userName,Integer classId,String reason);
    String viewResult(Integer id);
    String removeLeave(Integer studentId);


}
