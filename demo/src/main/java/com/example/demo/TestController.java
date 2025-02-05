package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class TestController {


    //이렇게쓰면 Spring 컨테이너는 TestService 타입의 빈(Bean)을 찾아서 tservice 필드에 주입합니다.
    @Autowired
    private TestService tservice;

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

    @GetMapping("/fillgrid") //http://localhost:8080/fillgrid 요청을 받으면,
    public String fillgrid(Model mm){
        List<Product> lstdata = tservice.findStore();//서비스에있는 findStore()호출
        mm.addAttribute("prolist",lstdata);//데이터베이스에서 데이터를 가져와 prolist라는 이름으로 View에 전달

        return "home";//View 파일(home.html)에서 이 데이터를 사용해 화면을 표시
    }
}

