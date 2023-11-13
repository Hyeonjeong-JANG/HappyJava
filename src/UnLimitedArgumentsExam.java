public class UnLimitedArgumentsExam {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(1, 2, 4, 2));
        System.out.println(sum(3, 1, 2, 3, 4, 1));
    }

    public static int sum(int... args) {//제한 없는 아규먼트 문법, int... args이렇게 하면 배열로 취급된다.
        System.out.println("print1 메소드 - args 길이: " + args.length);
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];//더한 값을 누적한 것이 sum이다.
        }
        return sum;
    }
}

//제한 없는 아규먼트 0개부터 n개까지 넘겨줄 수 있고 내부적으로는 배열로 선언된다.
//리턴타입 메소드이름(타입... 변수명){
//...
//}