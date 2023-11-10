package com.example;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        if (str1 == str2)
            //if문에서의 ==는 값이 같냐가 아니라 "같은 것을 참조하느냐?"의 의미
            //string을 사용할 때는 new를 사용하지 않고 선언해라.
            System.out.println("str1==str2");
        if (str1 == str3)
            System.out.println("str1==str3");
        if (str3 == str4)
            System.out.println("str3==str4");

        //그럼 값은 어떻게 비교하냐?! equals를 이용
        //StringExam2로 가보자!

        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
