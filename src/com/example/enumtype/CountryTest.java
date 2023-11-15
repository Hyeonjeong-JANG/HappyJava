package com.example.enumtype;

public class CountryTest {
    public static void main(String[] args) {
        Country country=Country.KOREA;
        country.print();
    }
}

//그 밖의 특징들
//Enum객체는 Enum 상수가 처음 호출되거나 참조될 때 생성된다.
//Enum은 Serializable과 Comparable 인터페이스를 이미 구현하고 있다.
//final static한 정수 타입으로 상수를 선언하지 말고 Enum타입을 상수로 선언해서 사용하자!!!