package com.cl.code.springbootmybatis.mapper;

import com.cl.code.springbootmybatis.model.Runoob;

import java.util.ArrayList;

public interface RunoobMapper {

    ArrayList<Runoob> findAll();

    Runoob findOne(Long id);

}
