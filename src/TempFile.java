import java.io.File;
import java.io.IOException;

//c:/temp
//tmp폴더에는 임시파일이 생겼다가 사라지고 그러는데 임시파일이 뭐냐?
//프로그램이 실행되는 동안에만 사용되는 파일

public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_", ".dat");
            System.out.println(f.getAbsolutePath());
            System.out.println("20초 동안 멈춰있습니다.");
            try {
                Thread.sleep(20000);//20초 동안 프로그램이 멈춰있는다. 1000밀리세컨드는 = 1초
            } catch (InterruptedException e1) {
                System.out.println(e1);
            }
            f.deleteOnExit();//JVM이 종료될 때 임시파일을 자동으로 삭제한다.
        } catch (IOException e) {
            System.out.println(e);
        }
    }//main
}
