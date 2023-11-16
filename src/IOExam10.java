import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class IOExam10 {
    public static void main(String[] args) throws Exception {
        //키보드로부터 한 줄 씩 입력받는다.
        //BufferedReader의 readLine()을 이용해야 한 줄 씩 입력받을 수 있다.
        //BufferedReader는 장식 역할을 수행한다.
        //키보드를 나타내는 것은 System.in - 주인공 - InputStream

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Reader를 파라미터로 받아야 한다. System.in- 키보드로 받겠다.
        String line = br.readLine();
        System.out.println(line);
        br.close();

    }
}