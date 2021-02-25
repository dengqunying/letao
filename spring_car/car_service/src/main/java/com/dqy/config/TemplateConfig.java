package com.dqy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

/**
 * @Deacription TODO
 * @Author 慕斯
 * @Date 2021/1/18 19:16
 * @Version 1.0
 **/

@Configuration
public class TemplateConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    //在spring中注册德鲁伊连接池对象,因为springboot对阿里的东西没有主动提供自动配置，所以需要我们手动注册
    public DataSource druid(){
        return new DruidDataSource();
    }
}
