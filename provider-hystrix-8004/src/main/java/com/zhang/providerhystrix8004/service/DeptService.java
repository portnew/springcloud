package com.zhang.providerhystrix8004.service;

import com.zhang.api.entity.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
