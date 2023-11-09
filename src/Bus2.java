public class Bus2 extends Car2{
    public Bus2(){
        super("Bus");//부모의 기본 생성자를 호출하는 코드가 자동으로 삽입된다.
        System.out.println("Bus2기본생성자");
    }
}
//부모가 기본 생성자가 없으면 자식의 생성자에서 부모가 가진 생성자를 직접 super()를 해서 불러줘야 한다.