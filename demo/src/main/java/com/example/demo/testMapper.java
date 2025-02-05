package com.example.demo; //해당경로패키지에 속한 인터페이스임을 알림

import org.apache.ibatis.annotations.Mapper; // @Mapper 어노테이션을 사용하기 위해 추가
import java.util.List; // List를 사용하기 위해 추가

// testMapper 인터페이스는 데이터베이스에서 데이터를 조작하는 메서드 정의
@Mapper
public interface testMapper {

    List<Product>findStore_S();

}

