package com.dqy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Deacription TODO
 * @Author 慕斯
 * @Date 2021/1/18 19:35
 * @Version 1.0
 **/

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Car_Web_App {
    public static void main(String[] args) {
        SpringApplication.run(Car_Web_App.class,args);
    }
}
