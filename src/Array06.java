public class Array06 {
    public static void main(String[] args) {
        double[] array1=new double[5];
        double[] array2= {1.5, 2.4, 3.5};
        double[] array3;
        double[] array4=null;

        System.out.println(array1.length);
        System.out.println(array1[0]);//double형 타입은 초기값이 0이다. 기본형 타입은 값을 가질 수 있는 것이기 때문에 아무런 값도 주지 않으면 0이 되는 것이다. 불린형의 기본값은 false다.
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);
        System.out.println("------------------------");
        System.out.println(array2.length);
//        System.out.println(array3.length);
//        System.out.println(array4.length);

    }
}
