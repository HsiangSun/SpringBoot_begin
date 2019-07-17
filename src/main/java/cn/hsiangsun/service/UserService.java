package cn.hsiangsun.service;

import cn.hsiangsun.mapper.UserMapper;
import cn.hsiangsun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void addUser(User user){
       userMapper.insertSelective(user);
    }

}
