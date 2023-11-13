public class EmptyCommandLineArgumentExam {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

//String[] args = new String[0];
//0개짜리 크기의 배열을 생성해서 메인 메소드 실행할 때 main(args); 이런식으로 실행했다 이거다.

//javac EmptyCommandLineArgumentExam.java
//java EmptyCommandLineArgumentExam a b c d e hello 이렇게 해주면 클래스를 실행할 때 뒤에 a b c d e hello 이게 args다(?) a b c d e hello 문자열 배열이 args에 들어오게 된다.
//java -javaagent:어떤설정 EmptyCommandLineArgumentExam a b c
//java 명령과 클래스명 중간에 있는 것은(-javaagent:어떤설정) java한테 주는 옵션이다. 뭔가 메모리 크기를 지정한다든지 에이전트를 설정한다든지 할 때 사용한다.