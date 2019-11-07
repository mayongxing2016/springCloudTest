package com.controller;


import com.TestM;
import com.test.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/csumer")
public class test {

    private final String URL_PREFIX="http://localhost:8001/";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TestM tm;

    @RequestMapping(value="/dept/get/{id}")
    public Dept getDept(@PathVariable Long id){

        Dept dept =  restTemplate.getForObject(URL_PREFIX+"dept/get/"+id,Dept.class);
        return dept;
    }

    @RequestMapping(value="/dept/list")
    public List<Dept> getAll(){
        List<Dept> list =new ArrayList<Dept>();
        list= restTemplate.getForObject(URL_PREFIX+"/dept/list",ArrayList.class);
        return list;
    }
}
