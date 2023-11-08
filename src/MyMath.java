public class MyMath {
    //자동생성 - 기본생성자는 생성자가 없을 경우 컴파일 할 떄 자동으로 생성된다.
    //public MyMath(){} //이런 모습이 자동으로 생성됨.

    //private MyMath(){} //이렇게 하면 MyMathTest의 MyMath m=new MyMath();의 MyMath부분에 오류가 난다.
    //생성자가 프라이빗하면 인스턴스를 만들지 못한다.

    //Math클래스를 만든 사람은 여러 개 인스턴스를 생성하지 못하게 함으로써
    //메모리를 절약할 수 있도록 하고 Math.메소드() 형식으로
    //쉽게 호출하도록 만들었다.
    //이때 인스턴스를 생성하지 못하도록 생선자를 private하게 만들 수 있게 했다.
    public static int abs(int x) {
        if (x < 0)
            return x * -1;
        else
            return x;
    }
}
