package cn.hsiangsun.controller;

import cn.hsiangsun.pojo.User;
import cn.hsiangsun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @Value("${hsiangsun.age}")
    private int age;

    @GetMapping("/hello")
    public String hello(){
        System.out.println("data source -->"+dataSource);
        return "Hello Spring Boot 牛皮！" + age * 0.5;
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable Integer id){
        return userService.findById(id);
    }

    @GetMapping("/age")
    public String getAge(String age){
        return age;
    }
}
