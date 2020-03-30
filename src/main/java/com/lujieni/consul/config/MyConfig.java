package com.lujieni.consul.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MyConfig {
    private String age;

    @Value("${age}")
    private void setName(String age){
        System.out.println(age);
        this.age = age;
    }

}
