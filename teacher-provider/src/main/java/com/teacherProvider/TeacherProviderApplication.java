package com.teacherProvider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.teacherProvider.dao")
public class TeacherProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherProviderApplication.class, args);
    }

}
