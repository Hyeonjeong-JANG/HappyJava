public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        double[] array = {1.5, 2.4, 3.5};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);//범위를 넘어서는거야. ArrayIndexOutOfBoundsException
        double[] array2=new double[0];
        System.out.println(array2.length);//0개짜리 배열도 있을 수 있다.
        System.out.println(array[0]);//ArrayIndexOutOfBoundsException

    }
}
