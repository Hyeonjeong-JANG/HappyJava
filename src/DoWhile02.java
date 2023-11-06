public class DoWhile02 {
    //do/while문은 무조건 한 번은 사용자에게 값을 입력 받고 싶을 때,
    // 그리고 입력 받은 값이 원하지 않은 값일 경우 종료하고 싶을 때 사용한다.
    public static void main(String[] args){
        int i=1;
        do{
            System.out.println(i);
            i++;
        } while(i<1);
    }
}
