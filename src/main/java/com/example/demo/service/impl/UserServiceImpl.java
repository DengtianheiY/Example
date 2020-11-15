package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        save(user);
    }

    @Override
    public List<User> findAll() {
        return list();
    }

    @Override
    public void delete(Long id) {
        removeById(id);
    }

    @Override
    public void update(User user) {
        updateById(user);
    }

    @Override
    public User findOne(Long id) {
//        return getById(id);
         return userMapper.getById(id);
    }

    @Override
    public List<User> findByName(String name) {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("name",name);
        return list(qw);
    }

    @Override
    public List<User> findByAge(Integer age) {
        QueryWrapper<User> qw= new QueryWrapper<>();
        qw.le("age",age);
        return list(qw);
    }

    @Override
    public List<User> findByTime(String startTime, String endTime) {
        return userMapper.getByTime(startTime,endTime);
    }


}
