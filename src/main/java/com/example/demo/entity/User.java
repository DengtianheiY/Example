package com.example.demo.entity;

import lombok.Data;

@Data
public class User extends BaseEntity{
    public Long id;

    public String name;

    public Integer age;

    public Integer gender;

}
