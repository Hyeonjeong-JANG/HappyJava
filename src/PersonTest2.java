public class PersonTest2 {
    public  static  void main(String[] args){
        Person p1=new Person();
        Person p2=new Person();
        p1.name="홍길동";
        p2.name="조조";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println("p1.count = "+p1.count);
        System.out.println("p2.count = "+p2.count);
        System.out.println("Person.count = "+Person.count);
        p1.count++;

        System.out.println("p1.count = "+p1.count);
        System.out.println("p2.count = "+p2.count);
        System.out.println("Person.count = "+Person.count);

        p2.count++;
        System.out.println("p1.count = "+p1.count);
        System.out.println("p2.count = "+p2.count);
        System.out.println("Person.count = "+Person.count);

        //p1의 count를 증가시키든 p2의 count를 증가시키든 둘 다 증가된다.
        //인스턴스를 만들지 않아도 Person을 JVM이 읽어들일 때 count변수는 메모리에 따로 올라간다.
        //count는 인스턴스 별로 저장되는 것이 아니라 통으로 묶어서(?) 저장되기 때문에
        //Person.count로 쓰는 것이 좋다.(p1.count 이런 식 말고)
        //*static필드를 클래스 변수라고도 한다.*
    }
}
