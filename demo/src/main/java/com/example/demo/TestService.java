package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private testMapper tmapper;


    List<Product>findStore(){
        return tmapper.findStore_S();
    }

}
