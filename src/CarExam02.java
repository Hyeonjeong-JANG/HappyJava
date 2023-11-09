public class CarExam02 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1);//println(Object x)
        // Object로 참조할 수 있는 것은 무엇이든 받을 수 있다.
        c1.printName();
        System.out.println("-------------------");
        Car c2=new Car("치타");
        c2.printName();
    }
}

//부모타입의 변수로 자식인스턴스를 참조할 수 있다.
//조상타입의 변수로 후손인스턴스를 참조할 수 있다.
//Car c1=new Bus();
//Car c1=new 이층버스();//이층버스가 Car의 자손이라면 오류가 안 난다.
//Object o1=new Car();
//Object o2=new Bus();
//Object o3=new 이층버스();
//오브젝트의 자손들은 다 이 메소드에 다 올 수 있다.
