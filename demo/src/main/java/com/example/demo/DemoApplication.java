package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
/*
데이터 흐름
사용자 요청 → TestController
TestService.findStore() 호출
testMapper.findStore_S() 호출
Tmapper.xml에서 SQL 쿼리 실행
쿼리 결과 → Product 객체 리스트로 반환
리스트 → Model을 통해 View로 전달
View(home.html)에 데이터 출력
*/