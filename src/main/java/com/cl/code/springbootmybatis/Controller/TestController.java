package com.cl.code.springbootmybatis.Controller;

import com.cl.code.springbootmybatis.mapper.RunoobMapper;
import com.cl.code.springbootmybatis.model.Runoob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {
    @Autowired
    private RunoobMapper runoobMapper;

    @RequestMapping(value = "/book/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello，《Spring Boot 2.x 核心技术实战 - 上 基础篇》！";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ArrayList<Runoob> findAll() {
        return runoobMapper.findAll();
    }
}
