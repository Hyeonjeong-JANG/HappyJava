import java.util.ArrayList;
import java.util.List;

public class ListExam02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //앞에는 인터페이스타입 뒤에는 실제 그 인터페이스를 구현하는 인스턴스 이렇게 해주면 좋아.

        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}

//프로그램 만들 때 인터페이스 먼저 선언하는 훈련을 해야한다.
//자연스럽게 설계를 하게 되는 것이지.
//프로그램을 잘 짜려면 인터페이스부터 선언해라.
//어떤 인터페이스가 있을까? 어떻게 설계하는 것이 좋을까? 먼저 생각하자.