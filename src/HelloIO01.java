import java.io.FileOutputStream;
import java.io.OutputStream;

//쓰는 예제
public class HelloIO01 {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("C:\\Users\\hyeon\\IdeaProjects\\HappyJava\\hellooi01.dat");//OutputStream out은 new FileOutputStream 해주면 FileOutputStream은 파일에다 쓰기 위한 스트림인데 추상클래스 OutputStream 레퍼런스타입을 삼은거야.
        out.write(1);//정수값이 들어간다.
        // 0000 0000     0000 0000     0000 0000     0000 0001
        out.write(255);
        out.write(0);
        out.close();//스트림은 사용하고 나면 꼭 클로즈를 해줘야 한다.
    }
}
