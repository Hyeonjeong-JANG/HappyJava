//다중 예외 처리
public class Exception6 {
    public static void main(String[] args) {
        //{4,2}로 바꿔서 실행해보고, int[] array = null로도 바꿔본다.
        int[] array = {4, 2};
        int[] value = new int[1];//new int[1]인 이유는 방은 한 개 짜리고
        try {
            value[0] = array[0] / array[1];//value[0]인 이유는 첫 번째 방이니까.
        } catch (java.lang.ArrayIndexOutOfBoundsException aiob) {
            System.out.println(aiob.toString());
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

//다중 예외 처리를 하지 않고 마지막 하나만 해도 될텐데 왜 저렇게 많은 예외를 적어놨을까?
//내가 ArrayIndexOutOfBoundsException, ArithmeticException에 대해서는 특별히 예외처리를 해주고 싶어서 해주는 것이야.