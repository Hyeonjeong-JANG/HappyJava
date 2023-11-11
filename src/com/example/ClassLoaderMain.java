package com.example;

import java.lang.reflect.Method;
import java.util.SplittableRandom;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
//        Bus b1 = new Bus();
//        b1.a();//참조하는 버스의 a메소드가 실행된다.

        //a() 메소드를 가지고 있는 클래스가 있다.
        //이 클래스 이름이 아직 무엇인지 모르겠다.
        //나중에 이 클래스 이름을 알려주겠다.
        //a()메소드를 실행할 수 있도록 코드를 작성해라.
        //래퍼런스변수명.a(); 이르케 해야하는데 클래스명을 모르는거야. 타입을 모르는거지.
        //이런 때 사용하는 것이 클래스로더!!

        //className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,(클래스가 없으면 에러가 남)
        //그 정보를 clazz가 참조하도록 한다.
//        String className = "com.example.Bus";
//        Class clazz = Class.forName(className);//forName에 빨간 줄이 오기 때문에 args)뒤에 throws Exception를 작성해 준다.
//        Method[] declaredMethods = clazz.getDeclaredMethods();//클래스가 가지 메소드들에 대한 정보들이 리턴된다.
//        for (Method m : declaredMethods) {//그 정보를 하나씩 꺼내서
//            System.out.println(m.getName());//배열의 이름들이 출력되게 한다.
//        }


        //아래의 세 줄은 Object 0 = new Bus();와 같은 말이다.
//        String className = "com.example.Bus";
//        String className = "com.example.SuperCar";//이렇게 바꾸면 어떤 문제가 발생할까?
        String className = "com.example.Bus";
//        SuperCar를 Bus로 형변환하기 때문에  Bus b = (Bus)o;에서 에러가 남.
        //에러를 막고 싶으면 SuperCar b = (SuperCar)o;라고 바꿔야 함.
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();//인스턴스가 생성된다. 이 클래스를 가지고 인스턴스를 만들어라. 이 말이다.
//        Bus b = (Bus)o;//o가 참조하는 것은 버스니까 버스로 형변환 해줘라.
//        Car b = (Car)o;
//        b.a();//a
        Method m = clazz.getDeclaredMethod("a", null);//a()메소드 정보를 가지고 있는 Method를 반환하다.
        m.invoke(o,null);//m이 가지고 있는 것으로 실행해줘라.오브젝트 o가 참조하는 객체의 m메소드를 실행하라.
        //그러면 마이홈이 가진 a메소드를 실행한다. 슈퍼카도 버스도 다 된다.
        //문자열로 클래스 이름과 메소드 이름을 받아들여서 실행할 수 있다 이거다!!!

        //그런데 Bus도 SuperCar도 참조하고 싶다? 그러면 어떻게 해야 하나!!
        //Car를 하나 만들어서 수퍼카와 버스가 Car를 상속하게 만들어라.
        //그러면   Car b = (Car)o; 이렇게 해서 String className = "com.example.SuperCar";이든 String className = "com.example.Bus";이든 다 참조할 수 있게 된다.
        //카를 상속 받는 클래스를 어떤 것을 받더라도 클래스 이름이 뭔지 몰라도 문자열로 받아들이면(String className = "com.example.SuperCar"; 다르게 받을 수도 있음.) 버스든 수퍼카든 거기에 있는 a라는 메소드를 호출할 수 있게 된다.
    }
}

////클래스 로더를 이용한 인스턴스 생성하기
//Class clazz = Class.forName("클래스풀네임");
//Object obj=clazz.newIntance();

//팩토리 메소드 패턴
//공장이 하는 일은?
//복잡한 생성 과정을 숨기고, 완성된 인스턴스만 반환한다.
//클래스 이름만 가지고 인스턴스를 만드는 공장을 만들 수 있고
//그 공장에 인스턴스를 요청만 하면 활용할 수 있다.
//스프링을 배우면 이게 유용하게 쓰이지요.