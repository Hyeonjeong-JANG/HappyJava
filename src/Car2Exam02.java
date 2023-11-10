public class Car2Exam02 {
    public static void main(String[] args) {
////        Car2 c=new Car2("치타");
//        Bus2 b=new Bus2();
//        b.run();
//
//        SportsCar s1=new SportsCar("sportsCar@@");
//        s1.run();

        Car2[] array = new Car2[2];//car2를 2개 참조할 수 있는 배열을 선언.
        array[0] = new Bus2();//1번째는 bus2 참조.
        array[1] = new SportsCar("sportsCar!!");//2번쨰는 sportsCar 참조
        for (Car2 c2 : array) {
            c2.run();
        }
    }
}
