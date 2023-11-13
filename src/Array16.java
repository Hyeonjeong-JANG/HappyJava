import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 6};
//        int[] array2 = {1, 2, 3, 4, 4};

        //비교할 때는 양수, 0, 음수를 생각해줘라.
        //x-y의 결과가 양수가 나왔다면? x가 크고 반대의 경우는 y가 큰거자너.
        //compare은 왼쪽 배열이 크면 양수, 오른쪽 배열이 크면 음수!!
        int compare = Arrays.compare(array1, array2);

        System.out.println(compare);
    }
}
