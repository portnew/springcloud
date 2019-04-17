package com.zhang.providerhystrix8004.mapper;

import com.zhang.api.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {



     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();



}
