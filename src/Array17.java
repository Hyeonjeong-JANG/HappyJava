import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};

        Arrays.sort(array);

        for (int i : array) {//오른차순정렬
            System.out.println(i);
        }
    }
}
