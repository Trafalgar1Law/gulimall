package com.atguigu.gulimall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@RefreshScope
@EnableSwagger2
@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gulimall.pms.dao")
@EnableAspectJAutoProxy(exposeProxy = true)
public class GulimallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallPmsApplication.class, args);
    }

}
