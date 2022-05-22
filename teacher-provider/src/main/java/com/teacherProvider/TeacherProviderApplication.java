package com.teacherProvider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan("com.teacherProvider.dao")
public class TeacherProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherProviderApplication.class, args);
    }

}
