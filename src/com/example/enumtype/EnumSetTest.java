package com.example.enumtype;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet eset = EnumSet.allOf(Day.class);//데이가 가지는 모든 상수들을 이셋에 넣어주게 된다.

        Iterator<Day> dayIter = eset.iterator();//이셋에 있는 것을 하나씩 모두 꺼내줌.

        while (dayIter.hasNext()) {
            Day day = dayIter.next();//하나씩 꺼내줌
            System.out.println(day);//선데이부터 하나씩 끝까지 출력됨.
        }
        System.out.println("--------------------------------------");

        EnumSet eset2 = EnumSet.range(Day.MONDAY, Day.WEDNESDAY);//range는 데이라는 상수가 정의된 사이값의 모든 것을 포함시켜준다.
        Iterator<Day> dayIter2 = eset2.iterator();
        while (dayIter2.hasNext()) {
            Day day = dayIter2.next();
            System.out.println(day);
        }
    }
}
