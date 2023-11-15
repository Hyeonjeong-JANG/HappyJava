public class MyException extends RuntimeException {//이렇게만 해도 런타임익셉션을 상속받았기 때문에 되지만 보통 익셉션을 객체로 사용할 때는
    // 1. 오류 메시지,
    // 2. 발생한 익셉션을 감싼 결과로 내가 만든 익셉션을 사용하고 싶을 때
    // 등의 목적이 있기 때문에 생성자를 만든다.


    public MyException(String message) {
        super(message);
    }

//    public MyException(Throwable cause) {//이대로 써도 좋지만
//        super(cause);
//    }

    public MyException(Exception cause) {//또 다른 익셉션을 감싸주기 위해서 이렇게 써도 좋아.
        super(cause);
    }
}