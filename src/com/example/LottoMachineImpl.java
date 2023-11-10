package com.example;
//인터페이스를 구현하게 되면 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩 할 필요가 있다.(implements에 커서 있는 상태에서 alt+ins -> Implements method 하고 빵빵)

public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;//내부적으로 볼을 받아서 가질 수 있어야 해서 이렇게 한다.

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;//받아들인 볼을 자신의 필드로 초기화해줌.
    }

    //Math.random() ==> 0.0 <= x < 1.0 0.54322342
//    위의 식에다가 45을 곱하면? 0에 45 곱하면 0, 1에 45 곱하면 45니까 아래같이 나와
//                      0.0 <= x < 45.0
//    그 실수를 정수로 바꾸게 되면 버림되니까 0~44가 나온다.
//                   (int) 0 <= x < 45     0~44
    @Override
    public void mix() {//야바위 스타일로 두개씩 바꿔가면서 랜덤하게 섞는다.
        for (int i = 0; i < 10000; i++) {
            int x1 = (int) (Math.random() * LottoMachine.MAX_BALL_COUNT);
            int x2 = (int) (Math.random() * LottoMachine.MAX_BALL_COUNT);
            if (x1 != x2) {
                Ball tmp = balls[x1]; //값을 치환할 때는 같은 type의 임시변수가 필요하다.
                balls[x1] = balls[x2];//ball의 x2가 참조하는 것을 ball의 x1이 참조하게 해라.
                balls[x2] = tmp;
            }//if
        }//for
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT];//Ball 6개를 참조할 수 있는 배열
        for (int i = 0; i < LottoMachine.RETURN_BALL_COUNT; i++) {
            result[i] = balls[i];
        }
        return result;
    }
}
