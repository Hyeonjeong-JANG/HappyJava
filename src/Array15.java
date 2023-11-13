import java.util.Arrays;//Arrays를 사용할 수 있다.
//java.lang 패키지의 클래스는 import를 하지 않아도 사용 가능.
public class Array15 {
    public static void main(String[] args) {
        char[] copyFrom = {'h', 'e', 'l', 'l', 'o', '!'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 4);
//        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 4);
        //자꾸 java.util쓰기 귀찮으니까 맨 위에 import 해주는 것이 좋다.
        //Arrays에 커퍼 놓고 alt + enter 하면 자동 import된다.

        for (char c : copyTo) {
            System.out.println(c);
        }
    }
}
