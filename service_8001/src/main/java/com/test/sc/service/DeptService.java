package com.test.sc.service;


import com.test.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    public boolean addDept(Dept dept);
    public Dept get(Long id);
    public List<Dept> getAll();
}
