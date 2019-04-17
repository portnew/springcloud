package com.zhang.consumerfeign.service;


import com.zhang.api.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * @Author 张宏运
 * @Date  2019-04-15 8:32
 **/
// @FeignClient(value = "SPRINGCLOUD-DEPT")

@FeignClient(value = "SPRINGCLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService
{
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    boolean add(Dept dept);
}