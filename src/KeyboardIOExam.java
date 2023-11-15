import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한 줄 씩, 입력 받고, 한 줄 씩 출력하시오.
        // 키보드: System.in(InputStream 주인공)
        // 화면에 출력: System.out(PrintStream 주인공)
        // 키보드로부터 입력받는다는 것은 문자를 입력받는 것: char 단위 입출력
        // char단위 입출력 클래스는 Reader, Writer
        // 한 줄 읽기 기능: BufferedReader라는 클래스는 readLine이라는 메소드를 가지고 있다. 더이상 읽어들일 것이 없으면(EOF) null을 반환. 버퍼드리더는 장식!
        // 한 줄 쓰기: PrintStream, PrintWriter

        //BufferedReader (X)
        //ChaReader (x) -문자로부터 읽어들이는거니까.
        //FilterReader(x) - 장식이라서 또 Reader를 넣어줘야 하므로 탈락
        //InputStreamReader (o) - 장식. System.in은 InputStreamReader이고 InputStream은 InputStream을 받아들이므로 이걸 쓰는 것이 적합하다. new BufferedReader(new InputStreamReader(System.in))
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {//한 줄 입력받는다. 더이상 읽어들 일 것이 없으면 null을 반환, ctrl + d누르면 종료됨.
            System.out.println("읽어들인 값: " + line);
        }

    }
}
