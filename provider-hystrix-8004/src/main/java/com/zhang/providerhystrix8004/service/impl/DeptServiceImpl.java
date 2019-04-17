package com.zhang.providerhystrix8004.service.impl;

import com.zhang.api.entity.Dept;
import com.zhang.providerhystrix8004.mapper.DeptMapper;
import com.zhang.providerhystrix8004.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper mapper;

    @Override
    public boolean add(Dept dept) {
        return mapper.addDept(dept);
    }



    @Override
    public Dept get(Long id) {
        return mapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return mapper.findAll();
    }
}
