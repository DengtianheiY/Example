package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserMapper extends BaseMapper<User> {
         User getById(Long id);

        List<User> getByName(String name);

        List<User> getByTime(@Param("startTime") String startTime,@Param("endTime") String endTime);
}
//BaseMapper 是mybatis封装好的方法
