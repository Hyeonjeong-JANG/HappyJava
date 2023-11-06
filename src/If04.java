public class If04 {
    //if문장에 중괄호가 없으면
    //if문 다음 문장만 조건에 따라 실행되고 그 다음 코드는 무조건 출력됨.

    public static void main(String[] args) {
        int a = 10;

        if (a > 5)
            System.out.println("a는 10보다 큽니다.");
        System.out.println("hello!");
    }
}
