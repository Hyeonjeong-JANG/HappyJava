import java.io.File;
import java.io.IOException;

//java FileInfo 파일이름
public class FileInfo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("사용법: Java FileInfo 파일이름");
            System.exit(0);//return; 이것도 종료 방법
        }//if end

        File f = new File(args[0]);
        if (f.exists()) {//파일이 존재할 경우
            System.out.println("length: " + f.length());
            System.out.println("canRead: " + f.canRead());
            System.out.println("canWrite: " + f.canWrite());
            System.out.println("getAbsolutePath: " + f.getAbsolutePath());
            try {
                System.out.println("getCanonicalPath: " + f.getCanonicalPath());
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("getName: " + f.getName());
            System.out.println("getParent: " + f.getParent());
            System.out.println("getPath: " + f.getPath());
        } else{//파일이 존재하지 않을 경우
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}

//아 이런 정보들을 자바에서 알아내서 볼 수 있구나!!