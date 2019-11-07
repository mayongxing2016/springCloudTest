package com.test.sc.controller;


import com.test.sc.service.DeptService;
import com.test.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @RequestMapping(value="/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable Long id){
        System.out.println("sddd");

        return deptService.get(id);
    }

    @RequestMapping(value="list", method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.getAll();
    }
}
