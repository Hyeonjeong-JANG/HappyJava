public class Switch02 {
    //switch(변수){
    // case 값1:
    //변수가 값1일때 실행된다.
    //break;
    // case 값2:
    //변수가 값2일때 실행된다.
    //break;
    //...
    //default:
    //변수의 값이 어떤 case에도 해당되지 않을 경우 실행된다.
    // }

    public static void main(String[] args){
        int num=1;
        switch(num){
            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
            case 3:
                System.out.println("3입니다.");
                break;
            default:
                System.out.println("1,2,3이 아닙니다.");


        }
    }
}
