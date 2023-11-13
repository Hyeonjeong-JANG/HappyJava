public class Array03 {
    //초깃값 있이 선언하기
    //기본형타입[] 변수명 = new 기본형타입[배열의크기];
    //변수명[index값]=값;
    //기본형타입[] 변수명 = new 기본형타입[]{값1, 값2,...};
    //기본형타입[] 변수명 = {값1, 값2, 값3,...};

    public static void main(String[] args) {
        int[] array1 = new int[5];//정수 5개를 담을 수 있는 배열을 선언
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;//array1 방식이 길어서 효율적이지 않아 보일 수 있으나 키보드나 파일로부터 입력받은 값으로 배열을 선언할 때는 이렇게 한다.
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 5};//new int[]생략한 것

        System.out.println("array1의 값 출력");
        for (int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("array2의 값 출력");
        for (int i = 0; i < 5; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("array3의 값 출력");
        for (int i = 0; i < 5; i++) {
            System.out.println(array3[i]);
        }
    }
}
