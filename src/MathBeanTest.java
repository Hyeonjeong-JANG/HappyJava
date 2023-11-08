public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean();

        math.printClassName();
        math.printNumber(5000);
        int x = math.getOne();
        System.out.println(x);
        int value = math.plus(200, 300);
        System.out.println(value);
    }

//    //static한 메소드는 인스턴스를 생성하지 않아도 호출할 수 있다. 갑자기? 이게머꼬
//    VendingMachine.printVersion();
}
