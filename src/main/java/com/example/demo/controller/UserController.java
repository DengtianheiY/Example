package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public void addUser(User user){
        userService.add(user);
    }
    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @PostMapping("/delete")
        public void delete(Long id){
            userService.delete(id);
    }
    @PostMapping("/update")
    public void update(User user){
        userService.update(user);
    }
    @GetMapping("/findOne")
    public  User findOne(Long id){
        return userService.findOne(id);
    }
    @GetMapping("/findByName")
    public List<User>findByName(String name){
        return userService.findByName(name);
    }
    @GetMapping("findByAge")
    public List<User>findByAge(Integer age){
        return userService.findByAge(age);
    }

    @GetMapping("/findByTime")
    public List<User>findByTime(String startTime,String endTime){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date start = simpleDateFormat.parse(startTime);
//        Date end = simpleDateFormat.parse(endTime);
        return userService.findByTime(startTime,endTime);
    }

}
