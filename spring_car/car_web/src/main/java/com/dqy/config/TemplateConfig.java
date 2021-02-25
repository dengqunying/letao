package com.dqy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Deacription TODO
 * @Author 慕斯
 * @Date 2021/1/18 19:16
 * @Version 1.0
 **/

@Configuration
public class TemplateConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
