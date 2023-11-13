public class Array01 {//배열은 참조형 타입이다.

    public static void main(String[] args) {
        int[] array1;
        int array2[];
        int array3[];

        array1 = new int[5]; //정수를 5개 가질 수 있는 배열을 선언한다.
        array2 = new int[5];
        array3 = new int[0]; //배열 인스턴스가 만들어지긴 하는데 배열이 0개인 배열을 선언했기 때문에 아무 것도 가질 수 없다.

        System.out.println(array1.length);//int[] array1=null; 배열을 이렇게 하면 NullPointException 오류가 난다. 배열을 선언했으면 반드시 초기화를 해줘야 한다.
        System.out.println(array2.length);
        System.out.println(array3.length);
    }
}
