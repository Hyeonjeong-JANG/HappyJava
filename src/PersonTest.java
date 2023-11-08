public class PersonTest {
    public static void main(String[] args) {
//        Person p1; //p1은 null이다.
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name="홍길동";
        p1.address="일산";
        p1.isVip=true;
        p2.name="조조";
        p2.address="서울";
        p2.isVip=false;

        //문자열은 new를 사용하지 않고 인스턴스를 만들 수 있다.
        //되도록 new를 사용하지 말자.
        //(String은 너무 자주 사용되기 때문에 ""만으로도 인스턴스를 사용할 수 있게 해준 것이다.)

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.address.length());
        System.out.println(p1.isVip);
        System.out.println("------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}
