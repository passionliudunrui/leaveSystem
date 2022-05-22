package com.studentProvider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.studentProvider.dao")
public class StudentProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentProviderApplication.class, args);
    }

}
