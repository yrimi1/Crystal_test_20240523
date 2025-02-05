package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service /*Spring에게 이 클래스가 서비스 계층에 속한다고 알려주는 어노테이션,,
          그러면 스프링은 @Service가 붙은 클래스를  **빈(Bean)**으로 등록하고
          다른 클래스에서 이 클래스를 사용할 때 의존성 주입이 가능합니다*/
public class TestService {

    @Autowired  /*의존성 주입(DI)을 통해 객체를 자동으로 주입해주는 어노테이션.*/
    private testMapper tmapper;


    List<Product>findStore(){
        return tmapper.findStore_S(); //맵퍼에있는 findStore_S()호출
    }

}



/*컨트롤러와 매퍼 간의 연결고리 역할*/
/*데이터베이스 조회를 위한 로직을 캡슐화*/