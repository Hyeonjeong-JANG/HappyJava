package com.example.enumtype;

public class DaySwitchTest {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;

        switch (day) {
//            case Day.SUNDAY://이렇게 쓰면 컴파일 에러
            case SUNDAY:
                System.out.println("일요일입니다.");
                break;
            case MONDAY:
                System.out.println("월요일입니다.");
                break;
            default:
                System.out.println("그 밖의 요일");
        }
    }
}
