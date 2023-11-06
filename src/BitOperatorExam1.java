public class BitOperatorExam1 {
    public static void main(String[] args){
        int a=4;
        int b=a>>1;//2의 1승으로 나눈다.

        System.out.println(b);

        int c=4;
        int d = c<<1; //2의1승으로 곱한다.
        System.out.println(d);

        ///>>>는 양수화 쉬프트로 그 결과가 모두 양수가 되고
        // 1000000>>>2를 하게 되면 00100000가 된다.
        // 10000000는 음수, 00100000는 양수이다.
        // (가장 앞자리가 1이면 음수, 0이면 양수)

    }
}
