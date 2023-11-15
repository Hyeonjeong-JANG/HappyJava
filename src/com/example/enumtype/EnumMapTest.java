package com.example.enumtype;
import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap emap = new EnumMap(Day.class);//Day에 정의된 상수만 사용 가능하다.

        emap.put(Day.SUNDAY, "일요일은 내가 짜파게티 요리사");
        emap.put(Day.FRIDAY, "불금!!");
        emap.put(Day.MONDAY, "월요일 좋아!!");

        System.out.println(emap.get(Day.SUNDAY));
    }
}
//키 값을 특정 enum의 상수값으로 쓰고 싶을 때 사용한다.