package api;

public interface TeacherService {
    String login(Integer id,String password);
    String register(Integer id,String userName,String password,Integer classId);
    String changePassword(String password);
    String handlerLeave();
}
