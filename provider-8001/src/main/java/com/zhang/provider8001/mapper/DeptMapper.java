package com.zhang.provider8001.mapper;

import com.zhang.api.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DeptMapper {



     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();



}
