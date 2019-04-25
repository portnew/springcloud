package com.zhang.provider8001.service;


import com.zhang.provider8001.entity.Dept;

import java.util.List;

public interface DeptService {
    int add(Dept dept);

    Dept get(Long id);

    List<Dept> list();

    List<Dept> listAll();
}
