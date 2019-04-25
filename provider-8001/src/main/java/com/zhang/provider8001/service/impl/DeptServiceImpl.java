package com.zhang.provider8001.service.impl;

import com.zhang.provider8001.entity.Dept;
import com.zhang.provider8001.mapper.DeptMapper;
import com.zhang.provider8001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper mapper;

    @Override
    public int add(Dept dept) {
        return mapper.insert(dept);
    }

    @Override
    public Dept get(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Dept> list() {
        return mapper.selectAll();
    }

    /**
     * @Author 张宏运
     * @Date  2019-04-25 10:56
     * 测试mybatis注解
     */
    @Override
    public List<Dept> listAll() {
        return mapper.listAll();
    }
}
