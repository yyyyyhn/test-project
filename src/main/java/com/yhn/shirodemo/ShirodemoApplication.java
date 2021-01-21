package com.yhn.shirodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.yhn.shirodemo.mapper")
@EnableAsync
public class ShirodemoApplication {

    public static void main(String[] args) {
        System.out.println("项目启动");
        SpringApplication.run(ShirodemoApplication.class, args);
    }

}
