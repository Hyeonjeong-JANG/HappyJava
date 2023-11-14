import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

//        Collections.sort(list);
        Collections.shuffle(list);//실행할 때마다 순서가 바뀌어서 나온다.

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
