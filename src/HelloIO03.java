import java.io.FileWriter;
import java.io.Writer;

public class HelloIO03 {
    public static void main(String[] args) throws Exception{
        Writer out= new FileWriter("C:\\Users\\hyeon\\IdeaProjects\\HappyJava\\hello.txt");
        out.write((int) '가');
        out.write((int) '나');
        out.write((int) '나');
        out.write((int) '다');//한글로 하면 3바이트 영어로 하면 1바이트
        out.write((int) 'a');
        out.close();
    }
}
