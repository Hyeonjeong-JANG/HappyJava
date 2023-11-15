import java.io.FileInputStream;
import java.io.FileNotFoundException;

//트라이 캐치를 해주는 방법이 있고 그게 싫으면 떠넘기기를 하면 된다.
//public class Exception4 {
//    public static void main(String[] args) {
//        //컴파일 오류가 발생한다.
//        try{
//            FileInputStream fis = new FileInputStream("Exception4.java");
//        }catch (FileNotFoundException fnfe){
//            System.out.println("파일을 찾을 수가 없어요.");
//        }
//    }
//}

//떠넘기기
public class Exception4 {
    public static void main(String[] args) throws FileNotFoundException {//메인메소드에 떠넘기는 것은 매우 무책임한 행동이다. 떠넘기면서 그냥 죽어라! 이러는 것이야.
        //컴파일 오류가 발생한다.
            FileInputStream fis = new FileInputStream("Exception4.java");
    }
}

//런타임익셉셥을 상속받아서 만들 것인가? 체크드익셉션을 상속받아서 만들 것인가?
//되도록이면 체크드익셉션은 만들지 말고 런타임익셉션으로 해라.
//체크드익셉션이 많아지면 귀찮아진다.