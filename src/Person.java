public class Person {
    String name;//인스턴스 필드(static이 붙어 있지 않음)
    String address;
    boolean isVip;
    static int count = 0;//클래스 피드

    static {//클래스 필드는 static 블록에서 초기화할 수 있다.
        count = 100;
    }

    public void printName() {//인스턴스 메소드
        //static이 없기 때문에 인스턴스 메소드를 만들어서 쓴다.
        System.out.println("내 이름은 " + name);
    }

    public static void printCount() {//클래스 메소드
        //static메소드라서 클래스명.메소드()해서 사용할 수 있다.
//        System.out.println(name);//static한 메소드에서는 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다.
        //클래스 메소드(static 메소드) 안에서는 클래스 필드(static 필드)만 사용할 수 있다.
        System.out.println("count: " + count);
    }
}
