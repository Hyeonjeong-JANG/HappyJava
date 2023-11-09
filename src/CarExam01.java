public class CarExam01 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.run();
        //run은 car가 가지고 있는 메소드.
        b1.안내방송();

        Car c1 = new Bus();//버스는 자동차다.
        c1.run();//
//        c1.안내방송();//사용불가

        Car c2 = new SuperCar();
        c2.run();
    }
}
