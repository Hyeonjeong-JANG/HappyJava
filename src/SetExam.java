import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();//set은 순서를 보장하지 않아.
//        set.add("hello");
//        set.add("hi");
//        set.add("hong");
//        set.add("hong");//hello, hi, hong 세 건만 나와.

        boolean flag1= set.add("hello");
        boolean flag2= set.add("hi");
        boolean flag3= set.add("hong");
        boolean flag4= set.add("hong");

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);//네 번째 값만 false! 중복된 값을 넣으면 저장이 되지 않고 false가 나와.


        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
