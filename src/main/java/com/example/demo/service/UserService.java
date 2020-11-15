package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;

import java.util.Date;
import java.util.List;

public interface UserService extends IService<User> {
    void add(User user);
    List<User> findAll();
    void delete(Long id);
    void update(User user);
    User findOne(Long id);
    List<User>findByName(String name);
    List<User>findByAge(Integer age);
    List<User>findByTime(String startTime,String endTime);
}
