package com.example;

public class CarExam {
    public static void main(String[] args) {
        Car c1 = new Car(){
            @Override
            public void a() {
                System.out.println("이름 없는 객체의 a()메소드 오버라이딩");
            }
        };//카를 상속 받지만 클래스를 만들고 싶지 않으면
        c1.a();
//        Car c2 = new Bus();

    }
}

/*
//이름 없는 클래스(Anonymous Class)
* new 생성자(){......}
생성자 뒤에 중괄호가 나오고 코드를 오버라이딩 하여 보통 구현한다.
Car car = new Car(){
    public void run(){
    System.out.println("Car를 상속받는 이름없는 객체가 run메소드를 오버라이딩함");
}}*/