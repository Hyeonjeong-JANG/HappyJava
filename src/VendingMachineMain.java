public class VendingMachineMain {
    public static void main(String[] args) {

        //static한 메소드는 인스턴스를 생성하지 않아도 호출할 수 있다.
        //인스턴스는 new 어쩌구
        VendingMachine.printVersion();

        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        vm1.printVersion();
        //static한 메소드는 레퍼런스변수면.static메소드();도 사용 가능.
        // 그런데 바람직하진 않아.
        //이탤릭체는 static한 메소드라서 레퍼런스로 접근하면 좋지 않다.
        System.out.println(product);
        String product2=vm2.pushProductButton(200);
        System.out.println(product2);
    }

    //javac VendingMachine.java
    //javac VendingMachineMain.java
    //java VendingMachineMain
    //VendingMachineMain은 어디서 찾아서 실행할까요?
    //틀린답) 현재 폴더에서 찾는다.
    //정답) CLASSPATH 경로에서 VendingMachineMain클래스를 찾아서 실행한다.

    //메소드 안에 선언된 지역변수는 메소드가 실행될 때 생성되었다가 메소드가 종료될 때 사라진다.
    //동시에 메소드가 호출되어서 문제가 없다.

}
