package com;


import org.springframework.stereotype.Repository;

@Repository
public class TestM {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
