package com.zhang.provider8003.controller;

import com.zhang.api.entity.Dept;
import com.zhang.provider8003.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController
{
    @Autowired
    private DeptService service;
    @Autowired
    DiscoveryClient client;

    @RequestMapping(value="/dept/add",method= RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
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

