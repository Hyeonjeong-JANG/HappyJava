import java.io.StringReader;

public class IOExam16 {
    public static void main(String[] args) throws Exception {
        StringReader in = new StringReader("hello world!!!");
        int ch = -1;
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);//문자를 읽어들였지만 ch는 정수값이기때문에 문자로 변환해서 출력하려고
        }
        in.close();
    }
}