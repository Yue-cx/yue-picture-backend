package com.yue.yuepicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.yue.yuepicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class YuePictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuePictureBackendApplication.class, args);
    }

}
