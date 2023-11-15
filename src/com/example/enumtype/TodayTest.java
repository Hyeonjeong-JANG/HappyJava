package com.example.enumtype;

public class TodayTest {
    public static void main(String[] args) {
        Today today = new Today();
        today.setDay(Day.SUNDAY);//setDay에는 Day에 있는 값만 올 수 있다. 이 경우 정수로 선언된 상수와 다르게 Day 안에 선언된 상수만 값으로 전달할 수 있다.
        System.out.println(today.getDay());

        //enum값끼리 비교할 때는 ==을 사용한다.
        Day day1=Day.MONDAY;
        Day day2=Day.MONDAY;

        if(day1 == day2){
            System.out.println("같은 요일입니다.");
        }
    }
}

//enum 방식으로 사용하게 되면 타입에 안전하다고 말할 수 있다.

//today.setDay(100); Day day = 5;//이런 코드는 사용할 수 없다.

//Enum은 switch문에서 사용 가능하다.
