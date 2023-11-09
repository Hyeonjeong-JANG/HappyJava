package com.example.main;

import com.example.util.Calculator;
//같은 이름의 클래스를 사용하고 싶어서 import 2개를 할 수는 없고
public class CalculatorMain {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        int value=cal.plus(50,100);
        System.out.println((value));

        com.example.util2.Calculator cal2=new com.example.util2.Calculator();
        //요로케 경로를 자세히 보이게(자동완성됨) 해야한다.
        int value2=cal2.divide(100,50);
        System.out.println(value2);
    }
}
