public class Hello2 {
    static int i;
    static {
        i=500;
        System.out.println("static block");
    }
}

//자바의 메모리!!
//new연산자를 사용할 때마다 메모리에 인스턴스가 생성된다.
//인스턴스는 더이상 참조되는 것이 없을 때, 나중에(언제가 될지는 모름, 보통 메모리가 부족할 떄) 가비지 컬렉션(Garbage Collection)이 된다.
//static한 필드는 클래스가 로딩될 때 딱 한 번 메모리에 올라가고 초기화 된다.
//인스턴스 메소드(static이 안 붙은 메소드)는 인스턴스를 생성하고 나서 레퍼런스 변수를 이용해 사용할 수 있다.
//클래스 메소드는 클래스명.메소드명()으로 사용 가능하다.
//메소드 안에 선언된 변수들은 메소드가 실행될 때 메모리에 생성되었다가, 메소드가 종료될 때 사라진다.