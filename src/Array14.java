public class Array14 {
    //Arrays는 배열을 다룰 때 사용하는 유틸리티
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};//세 가지 원소를 가진 배열이 선언됨.

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);//Arrays는 자바유틸이라는 패키지에 포함되어 있다.
        // import를 받거나 클래스명 앞에 java.util를 적어줘야 한다.
        if (copyTo == copyFrom) {
            System.out.println("copyTo == copyFrom");
        } else {
            System.out.println("copyTo != copyFrom");
        }//copyTo와 copyFrom은 서로 다르다.
        //배열을 복사한다는 것과 같은 배열을 참조한다는 것은 완전히 다른 이야기다.
        //깊은 복사(Deep Copy) vs 얕은 복사(Shallow Copy)

        for (int c : copyTo) {
            System.out.println(c);//카피투에 있는 배열을 하나씩 꺼내서 보여줌. 1,2,3
        }

        System.out.println("-----------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);//카피프롬으로부터 5개를 복사해서 카피투2로 출력함.
        //세 개만 있는데 5개를 복사하니 4, 5의 자리에는 0이 출력됨.

        for (int c : copyTo2) {
            System.out.println(c);
        }

        int[] copyTo3 = copyFrom;
        for (int c : copyTo3) {
            System.out.println(c);
        }
    }
}

