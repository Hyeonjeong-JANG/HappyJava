package com.example;

/*
 * 1. 1~45까지 써있는 ball을 로또 기계에 넣는다.
 * 2. 로또 기계에 있는 ball들을 섞는다.
 * 3. 섞인 ball중에서 6개를 꺼낸다.
 * */
public interface LottoMachine {

    //    public static int MAX_BALL_COUNT = 45;//모두가 public static 하기 때문에 생략 가능.
    int MAX_BALL_COUNT = 45;
    //    public static int RETURN_BALL_COUNT = 6;
    int RETURN_BALL_COUNT = 6;

    //    public abstract void setBalls(Ball[] balls); //인터페이스가 가지는 메소드는 모두 추상메소드다. 그래서 abstract를 그냥 생략해도 되는거야.
    public void setBalls(Ball[] balls);//Ball[] ball이 여러개를 받겠다.45개를 받음.

    //    public abstract void mix();
    public void mix();//자기가 가지고 있는 ball들을 섞는다.

    public Ball[] getBalls(); //6개의 ball을 반환한다.

}
