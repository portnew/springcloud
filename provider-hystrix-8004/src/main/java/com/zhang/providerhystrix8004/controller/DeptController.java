package com.zhang.providerhystrix8004.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhang.api.entity.Dept;
import com.zhang.providerhystrix8004.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author 张宏运
 * @Date  2019-04-15 13:57
 **/
@RestController
public class DeptController
{
    @Autowired
    private DeptService service;
    @Autowired
    DiscoveryClient client;


/**
 * @Author 张宏运
 * @Date  2019-04-15 14:04
 * 一旦调用服务方法失败并抛出错误信息，会自动调用fallbackMethod
 **/
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept = service.get(id);
        if(null == dept)
        {
            throw new RuntimeException("该ID："+id+"没有没有对应的信息");
        }
        return dept;
    }
    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        return new Dept().setDeptno(id)
                .setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }



    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }
    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @GetMapping("/dept/discovery")
    public Object discovery() {

        List<String> list = client.getServices();
        System.out.println(list);
        List<ServiceInstance> sevList = client.getInstances("SPRINGCLOUD-DEPT");
        for (ServiceInstance e : sevList) {
            System.out.println(e.getServiceId() + "\t" + e.getHost() + "\t" + e.getPort() + "\t" + e.getUri());
        }
        return this.client;
    }

}

