public class Array10 {
    public static void main(String[] args) {
        int[][] array = new int[2][];//어레이 2개짜리인데 그 안의 세부 내용이 아직 정해지지 않았음. 그걸 밑에서 정함. 가변배열
        //학급마다 학생 수가 다른 그런 경우에 사용
        array[0] = new int[2];//정수 두 개를 참조할 수 있는 배열이 만들어 짐.
        array[1] = new int[3];//정수 세 개를 참조할 수 있는 배열이 만들어 짐.

        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;

        for (int i = 0; i < array.length; i++) {//0, 1
            for (int j = 0; j < array[i].length; j++) {//0, 1, 2
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
