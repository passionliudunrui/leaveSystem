package api;



import pojo.NewForm;

import java.util.List;

public interface TeacherService {
    String login(Integer id,String password);
    String register(Integer id,String userName,String password,Integer classId);
    String changePassword(String password);
    String handlerLeave(Integer studentId);
//    List<NewForm> selectNewForms(Integer classId);

    String selectNewForms(Integer classId);
}
