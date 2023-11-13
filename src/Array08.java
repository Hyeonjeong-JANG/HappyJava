public class Array08 {
    //이차원 배열
    //타입[][] 변수명 = new 타입[행의수][열의수];
    //변수명[행인덱스][열인덱스]=값;
    public static void main(String[] args) {
        int[][] array = new int[2][3];//배열이 두 개짜리 참조하는 것이 있고 그 안에 또 세 개짜리 참조 하는 것이 있다.
        array[0][0] = 0;
        array[0][1] = 1;
        array[0][2] = 2;

        array[1][0] = 3;
        array[1][1] = 4;
        array[1][2] = 5;

        for (int i = 0; i < array.length; i++) {//0, 1
            for (int j = 0; j < array[i].length; j++) {//0, 1, 2
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}