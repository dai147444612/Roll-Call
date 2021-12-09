package com.inet.code;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.inet.code.mapper")
public class RollCallApplication {

    public static void main(String[] args) {
        SpringApplication.run(RollCallApplication.class, args);
    }

}
