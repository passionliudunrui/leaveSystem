package com.studentProvider;

import com.studentProvider.dao.NewFormDao;
import com.studentProvider.dao.OldFormDao;
import com.studentProvider.dao.StudentDao;
import com.studentProvider.entity.NewForm;
import com.studentProvider.entity.OldForm;
import com.studentProvider.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@SuppressWarnings("all")
class StudentProviderApplicationTests {


    @Autowired
    private StudentDao studentDao;

    @Autowired
    private OldFormDao oldFormDao;

    @Autowired
    private NewFormDao newFormDao;

    @Test
    void contextLoads() {


//        List<Student> all = studentDao.findAll();
//        System.out.println(all);
//
//        Student check = studentDao.check(12, "323");
//        System.out.println(check);

//        OldForm oldForm=new OldForm(12,12,2);
//
//        int insert = oldFormDao.insert(oldForm);
//        System.out.println(insert);

        NewForm newForm=new NewForm(345,23,"睡觉",0,0);
        System.out.println(newForm);
        int ans = newFormDao.insert(newForm);

        System.out.println(ans);

        int update = newFormDao.update(1, 345);
        System.out.println(update);

        int delete = newFormDao.delete(345);
        System.out.println(delete);

    }

}
