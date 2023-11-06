public class Gugudan02 {
    public static void main(String[] args){
        for(int k=1; k<=9; k++){
            for(int i=1; i<=9; i++){
                System.out.println(k+"*"+i+"="+(k*i));
            }
            System.out.println(); //이거 쓰나 안 쓰나 똑같은데?
            // 무슨 이유일까? 한줄띄우기였구나!!!
        }
    }
}
