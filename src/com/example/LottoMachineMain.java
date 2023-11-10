package com.example;

public class LottoMachineMain {
    public static void main(String[] args) {

        //같은 타입의 변수가 여러개 필요하면 배열을 사용하면 된다. 공이 45개 필요하자나.
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT]; //변수가 45개 필요하다. ball인스턴스를 45개 "참조"할 수 있는 배열이 만들어진다. 인스턴스를 45개 만든 것이 아니다!!!
//        balls[0]=new Ball(1);
//        balls[1]=new Ball(2);
//        ...
//        balls[43]=new Ball(44);
//        balls[44]=new Ball(45);//45개 적으면 너무 기막히니까 반복문을 써준다.
        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }
        //LottoMachine인스턴스가 생성된다.
        LottoMachine lottoMachine = new LottoMachineImpl();//로또모신은 인스턴스가 될 수 없지만 참조할 수는 있다. 로또머신임플은 인스턴스가 될 수 있다.
        lottoMachine.setBalls(balls);//머신에 볼을 넣음
        lottoMachine.mix();//섞음
        Ball[] result = lottoMachine.getBalls();//공을 꺼내고 리턴받음

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());//출력
            //이러면 완성? 아니! 로또머신 구현체를 구현해줘야해. 로또머신임플로 가자!
        }
    }
}
