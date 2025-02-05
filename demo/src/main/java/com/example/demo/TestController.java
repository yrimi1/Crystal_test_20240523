package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class TestController {   ///여기 컨트롤러 고쳤지롱  ///이렇게 적으면 자동으로 로컬에 들어간다구? 


    @Autowired
    private TestService tservice;

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/fillgrid")
    public String fillgrid(Model mm){
        List<Product> lstdata = tservice.findStore();
        mm.addAttribute("prolist",lstdata);

        return "home";
    }
}

