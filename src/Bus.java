//버스는 자동차의 한 종류다.
public class Bus extends Car {
    public void run(){
        System.out.println("후륜구동으로 달리다.");
    }
    public void 안내방송() {
        System.out.println("안내방송하다.");
    }
}

//메소드가 오버라이딩 되면 무조건 자식의 메소드가 실행된다.
//Car car = new Bus();
//car.run();//Bus의 run()메소드가 실행된다.
