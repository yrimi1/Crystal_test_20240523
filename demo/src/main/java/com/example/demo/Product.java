package com.example.demo;

import lombok.Data; //@Data어노테이션 사용을 위해 넣음

@Data // @Data 어노테이션 덕분에 Product 클래스에는 따로 Getter, Setter 메서드를 작성하지 않아도 됨.
public class Product {
    public String productZZZ; /*프로시저의 파라미터와 같은이름일것*/
    public Integer qty;
    public String comments;
}

/*Product는 반환된 결과를 담는 DTO(Data Transfer Object) */

/*
@Data의 역할
Getter/Setter 메서드
toString() 메서드
equals() 및 hashCode() 메서드
기본 생성자
*/