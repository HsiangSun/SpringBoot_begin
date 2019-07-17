package cn.hsiangsun.service;

import cn.hsiangsun.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void findById() {
        User user = userService.findById(1);
        System.out.println(user);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUsername("heyue");
        user.setPassword("5201314");
        user.setBirthday(new Date());

        userService.addUser(user);
    }
}