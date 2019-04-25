package com.zhang.provider8001.mapper;

import com.zhang.provider8001.entity.Dept;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tkmybatis.MyMapper;

import java.util.List;

public interface DeptMapper extends MyMapper<Dept> {
    @Select("select * from dept")
    @Results({
            @Result(column = "db_source",property = "dbSource",javaType = String.class),
    })
    List<Dept> listAll();
}