package com.example;

//불변객체: 생성자에서 어떤 초기값을 넘겨서 필드를 초기화해주고 값을 리턴만 해주도록 하는 클래스
public class Ball {
    private int number;

    public Ball(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
//로또볼에 있는 숫자가 막 섞이면서 변하면 안 되니까 private으로 한다.(불변클래스, 이뮤터블클래스)

}
