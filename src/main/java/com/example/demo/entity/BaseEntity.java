package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class BaseEntity {

    @TableField(fill = FieldFill.INSERT)
    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date createTime;

    public String creator;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    public Date updateTime;

    public String updator;
    @TableLogic
    public Integer isDel;

}
