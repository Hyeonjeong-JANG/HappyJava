public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용법: CommandLineArgumentExam 값 값...");
            System.exit(0);//return;으로 변경 가능//프로그램이 종료됨. 그런데 괄호 안에 들어가는 숫자는 무엇을 의미할까?
        }
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}

/*

Hello.java 파일 작성하고
javac Hello.java
명령을 실행할 때 성공하면 아무런 메시지도 출력하지 않는다. =--> Unix철학.
Linux도 Unix의 계열이다.

작은 명령들을 조합해서 또다른 명령을 만든다.(쉘 스크립트 작성)
작명 명령들이 실행되고 종료될 때, 성공? 실패? 여부가 궁금하단 말이다.
그래서 조건문을 적어주는데 그 때 실행되는 것이 System.exit(0);의 (0) 이거다.
내가 만든 프로그램이 종료코드를 리턴해 주는데 이 종료코드를 가지고 프로그램들을 조합해서 만들 때

자바 공부를 하면 리눅스도 공부해야 한다.

 */