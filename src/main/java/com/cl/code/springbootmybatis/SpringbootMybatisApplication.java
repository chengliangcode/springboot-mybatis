package com.cl.code.springbootmybatis;

import com.cl.code.springbootmybatis.mapper.RunoobMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@MapperScan("com.cl.code.springbootmybatis.mapper")
public class SpringbootMybatisApplication {



    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }



}
