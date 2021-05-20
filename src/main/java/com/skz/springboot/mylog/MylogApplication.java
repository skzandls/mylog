package com.skz.springboot.mylog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.skz.springboot.mylog")
@MapperScan("com.skz.springboot.mylog.mapper")
public class MylogApplication {

    public static void main(String[] args) {
        SpringApplication.run(MylogApplication.class, args);
    }

}
