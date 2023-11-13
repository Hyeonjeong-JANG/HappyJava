public class Array12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

//        for (int i = 0; i < array.length; i++) {//i: 0,1,2,3,4
//            System.out.println(array[i]);
//        }//이걸 for each 문으로 하면 아래와 같다.
        //for each문은 코드양을 줄이는 데도 유용하지만 배열의 처음부터 끝까지 몽땅 꺼내올 때 편리하다.

        for (int i : array) {
            System.out.println(i);
        }
    }
}
