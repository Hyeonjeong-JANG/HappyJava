import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};

        Arrays.sort(array);

        //1~100 중 x라는 숫자를 생각하자.
        //친구가 맞추는데 중간값을 찾는 방식으로 찾음.
        //1~100    50
        //1~50     25

        int i = Arrays.binarySearch(array, 4);//4를 찾아라!!! 하면 세 번에 인덱스가 4가 있다! 이런 의미로 i가 3이 나옴.
        System.out.println(i);
    }
}
