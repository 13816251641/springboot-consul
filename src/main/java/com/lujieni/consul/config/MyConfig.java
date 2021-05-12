package com.lujieni.consul.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class MyConfig {
    private String age;

    private String name;

    @Value("${age}")
    private void setAge(String data){
        System.out.println(data);
        this.age = data;
    }

    @Value("${name}")
    private void setName(String data){
        System.out.println(data);
        this.name = data;
    }


}
