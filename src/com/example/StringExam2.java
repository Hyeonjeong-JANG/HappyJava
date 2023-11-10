package com.example;

public class StringExam2 {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hello");

        if(str1.equals(str2)){//값이 같으냐?
            System.out.println("str1과 str2의 값이 같다.");
        }

        String s = str1.toUpperCase();//소문자를 다 대문자로 변경해서 출력하슈.
        System.out.println(s);
        System.out.println(str1);//string은 불변케이스이기때문에 딱 정해진대로만 출력된다. 값이 변하지 않아.
        String substring=str1.substring(3);//세 번째 있는 값부터 잘라서 리턴해주세요.
        System.out.println(substring);
        System.out.println(str1);

        //String클래스는 왜 final일까?
        //String과 비슷하지만 내부가 변하는 StringBuffer클래스!
        //StringBuilder

        StringBuffer sb = new StringBuffer(); // 기본 16 버퍼 크기로 생성

        // sb.capacity() - StringBuffer 변수의 배열 용량의 크기 반환
        System.out.println(sb.capacity()); // 16

        sb.append("1111111111111111111111111111111111111111"); // 40길이의 문자열을 append
        System.out.println(sb.capacity()); // 40 (추가된 문자열 길이만큼 늘어남)
    }
}
