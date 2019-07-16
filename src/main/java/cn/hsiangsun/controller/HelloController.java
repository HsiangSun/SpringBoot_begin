package cn.hsiangsun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${hsiangsun.age}")
    private int age;

    @GetMapping("/hello")
    public String hello(){
        //System.out.println("data source -->"+dataSource);
        return "Hello Spring Boot 牛皮！" + age * 0.5;
    }
}
