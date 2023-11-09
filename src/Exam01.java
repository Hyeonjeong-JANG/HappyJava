public class Exam01 {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        System.out.println(p1.i);//말고
        p1.printI();//이거
        System.out.println("----------------");
        Child c1 = new Child();
        System.out.println(c1.i);//말고
        c1.printI();//이거
        System.out.println("----------------");
        Parent p2 = new Child();//Child는 Parent의 후손이라 오류가 나지 않는다.
        System.out.println(p2.i);//말고
        p2.printI();//이거
        //정보은닉
        //필드를 직접 쓰지 말고 필드는 메소드를 통해서만 접근해서 사용하도록 한다.
    }
}
