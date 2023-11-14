/*
//B라는 사용자가 A라는 사용자가 만든 ExceptionObj1을 이용한다.
public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exobj = new ExceptionObj1();
        // int value = exobj.divide(10, 5);//제대로 2가 출력됨
        int value = exobj.divide(10, 0);//Exception 오류가 나서 종료됨. 0으로 나눌 수는 없으니까!!
        System.out.println(value);
    }
}

//A라는 사용자
class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;

//        value = i / k;//0으로 나눠주는 부분에서 오류가 생기기 때문에 아래와 같이 트라이 캐치문을 적어서 어떻게 해보자.
        try {
            value = i / k;
        } catch (ArithmeticException ex) {//발생한 익셉션을 잡기 위해서 타입명 적어주고 발생한 인스턴스를 참조하는 ex라는 변수를 적어주는 것이다.
            System.out.println("0으로 나눌 수 없어요.");
            System.out.println(ex.toString());
        }
        return value;//근데 0으로는 뭘 나눌 수 없고 그래서도 안 되잖아. 에러나는 것만 못한 결과인 것이다. 이게 다른 계산식에 사용되어서 잘못된 계산에 나온다면? 망하는 것이다!!
    }
}//이 클래스의 두 가지 문제점!! 0으로 나눈 값이 나오기 때문에 심각한 오류를 발생시킬 수 있고, 사용자가 원하지 않는 메시지가 출력된다.


//프로그램이 종료가 되지 않게 하려면? try-catch를 해준다.

//try{
//    코드1
//    코드2
//} catch(Exception클래스명1 변수명1){
//        Exception을 처리하는 코드
//} catch(Exception클래스명2 변수명2){
//         Exception을 처리하는 코드
//}//코드1에서 Exception이 생기면 코드2로 가지 않고 해당 Exception과 관련된 catch블록으로 가서 그 블록이 실행되고 끝난다.
*/

//예외 던지기 Exception Throw
public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exobj = new ExceptionObj1();
        int value = exobj.divide(10, 0);
        System.out.println(value);
    }
}

//A라는 사용자
class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;

        try {
            value = i / k;
        } catch (ArithmeticException ex) {
            System.out.println("0으로 나눌 수 없어요.");
            System.out.println(ex.toString());
        }
        return value;
    }
}