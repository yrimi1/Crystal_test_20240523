package com.example.demo; //해당경로패키지에 속한 인터페이스임을 알림

import org.apache.ibatis.annotations.Mapper; // @Mapper 어노테이션을 사용하기 위해 추가
import java.util.List; // List를 사용하기 위해 추가

// testMapper 인터페이스는 데이터베이스에서 데이터를 조작하는 메서드 정의
@Mapper // @Mapper 를 써서 MyBatis에게 이 문서가 맵퍼임을알림.
public interface testMapper {

    List<Product>findStore_S();
    // resources의  .xml 파일에서
    // id가 "findStore_S" 인 프로시저 호출 , 결과값 받아서 Product형식의 List에 넣음
    // Product는 임의의 변수명이아니고,
    // tmapper.xml의 내용중 resultType="com.example.demo.Product"라는문구로 반환받았듯이
    // Product클래스로 구성된 리스트를 만든다는뜻이므로 반드시 Product로 작성
}

