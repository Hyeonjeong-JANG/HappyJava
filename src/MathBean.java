public class MathBean {
    //메소드 이름: printClassName
    //매개변수없음, 리턴타입없음
    //=> 리턴타입을 화면에 출력해 준다.
    public void printClassName() {
        System.out.println("MathBean");
    }

    //메소드 이름: printNumber
    //매개변수 int x, 리턴타입없음
    // => 매개변수로 받아 정수를 화면에 출력한다.
    public void printNumber(int number) {
        System.out.println(number);
    }

    //메소드 이름: getOne
    // 매개변수없음, 리턴타입 int => 숫자 1을 리턴한다.
    public int getOne() {
        return 1;
    }

    //메소드 이름: plus
    //매개변수 int x, int y, 리턴타입 int
    //=> 매개변수로 정수 2개를 받아들인 후, 그 합을 리턴한다.
    public int plus(int x, int y) {
        return x + y;
    }
}
