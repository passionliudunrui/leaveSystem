package com.teacherProvider;

import com.teacherProvider.dao.NewFormDao;
import com.teacherProvider.dao.TeacherDao;
import com.teacherProvider.entity.NewForm;
import com.teacherProvider.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SuppressWarnings("all")
class TeacherProviderApplicationTests {

    @Autowired
    private NewFormDao newFormDao;

    @Autowired
    private TeacherDao teacherDao;

    @Test
    void contextLoads() {

//        NewForm newForm=new NewForm(111,12,"约会",0,0);
//        int insert = newFormDao.insert(newForm);
//        System.out.println(insert);
//
//        int update = newFormDao.update(1, 111);
//        System.out.println(update);
//
//        int delete = newFormDao.delete(1);
//        System.out.println(delete);

        Teacher check = teacherDao.check(12, "212");
        System.out.println(check);

    }

}
