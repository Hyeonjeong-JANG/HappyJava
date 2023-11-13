package com.example;

public class MyRunnableMain2 {
//    public static void main(String[] args) {
//        MyRunnable myRunnable=new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        };
//        RunnableExecute runnableExecute=new RunnableExecute();
//        System.out.println("------------");
//        runnableExecute.execute(myRunnable);
//        System.out.println("------------");
//    }
//public static void main(String[] args) {
//
//    RunnableExecute runnableExecute=new RunnableExecute();
//    System.out.println("------------");
//    runnableExecute.execute(  new MyRunnable() {//이걸 바로 여기에 넣는 이유는 MyRunnable myRunnable를 재사용 할 필요가 없다고 생각할 때 이렇게 이름 없는 객체를 사용한다.
//        @Override
//        public void run() {
//            System.out.println("hello");
//        }
//    });
//    System.out.println("------------");
//}
public static void main(String[] args) {

    RunnableExecute runnableExecute=new RunnableExecute();
    System.out.println("------------");
    runnableExecute.execute(()-> {
            System.out.println("hello");
        }
//    ()-> {
//        System.out.println("hello");
//    }//이 부분이 이름 없는 객체를 줄여쓴 것이다. 꼭 화살표함수같이생김.(람다인터페이스)

            //람다 인터페이스는 메소드를 한 개 가지고 있다.
            //람다 인터페이스를 사용하는 람다 표현식은 JDK8에서 추가되었다.
            //JDK8에 추가된 이러한 문법들을 사용할 때 보통 모던 자바(Modern JAVA)라고 한다.
            //스트림api와 사용하면 아주 편리한 코드를 적성해낼 수 있다.
   );
    System.out.println("------------");
}
}
