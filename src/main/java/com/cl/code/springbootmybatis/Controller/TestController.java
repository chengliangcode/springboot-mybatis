package com.cl.code.springbootmybatis.Controller;

import com.cl.code.springbootmybatis.mapper.RunoobMapper;
import com.cl.code.springbootmybatis.model.Runoob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class TestController {
    @Autowired
    private RunoobMapper runoobMapper;


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello，《Spring Boot 2.x 核心技术实战 - 上 基础篇》！";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ArrayList<Runoob> findAll() {

        System.out.println(new Date());
        System.out.println(new Date().getTime());
        Timestamp timestamp = new Timestamp(new Date().getTime());
        System.out.println(timestamp);
        ArrayList<Runoob> runoobs = runoobMapper.findAll();
        for (Runoob runoob:runoobs) {
            System.out.println(runoob);
        }
        return runoobs;
    }

}
