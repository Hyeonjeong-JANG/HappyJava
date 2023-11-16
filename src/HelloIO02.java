import java.io.FileInputStream;
import java.io.InputStream;

public class HelloIO02 {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("C:\\Users\\hyeon\\IdeaProjects\\HappyJava\\hellooi01.dat");
//        int i1 = in.read();
//        System.out.println(i1);//1
//
//        int i2 = in.read();
//        System.out.println(i2);//255
//
//        int i3 = in.read();
//        System.out.println(i3);//0
//
//        int i4 = in.read();
//        System.out.println(i4);//-1('파일의 끝' 이라는 뜻)
        //이 방법은 좀 무식!

//  파일의 끝이 올 때까지 다 구하는 방법!! 1byte씩 모든 데이터를 읽어오는 예제!
        int buf = -1;
        while ((buf = in.read()) != -1) {
            System.out.println(buf);
        }

        in.close();
    }
}
