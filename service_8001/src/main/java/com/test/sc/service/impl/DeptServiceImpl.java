package com.test.sc.service.impl;

import com.test.sc.dao.DeptDao;

import com.test.sc.service.DeptService;
import com.test.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {

        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        System.out.println("service....");
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> getAll() {
        return deptDao.findAll();
    }
}
