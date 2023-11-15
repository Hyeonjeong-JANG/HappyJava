import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("/users/hyeon/IdeaProjects/HappyJava/HappyJava.iml");

        printFiles(file);
    }

    private static void printFiles(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                printFiles(files[i]);//파일이 디렉토리면 목록을 출력
            }
        }else{
            System.out.println(file.getName());//디렉토리가 아니면 파일명 출력
        }
    }
}
