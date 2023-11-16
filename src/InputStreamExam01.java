import java.io.IOException;
import java.io.InputStream;

/*
* 1byte(8bit)가 표현할 수 있는 값은 : 00000000 ~ 11111111
* read() 메소드가 읽어들일 수 있는 정보는 위의 값이 표현할 수 있는 것 중 하나다.
* 더이상 읽어들일 것이 없다!!
* 1byte씩 파일을 읽어들인다. 100바이트면 1바이트씩 100번을 읽는거야.
* 그런데 만약에 1바이트씩 읽어들이는데 파일의 크기를 몰라. 그럼 언제까지 읽어들이느냐?
* 더이상 읽어들일 것이 없을 때까지!!!
* EOF(End Of File): 더이상 읽어들일 것이 없다.
* EOF를 뭘로 표현하지? 00000000 ~ 11111111 이걸로는 표현할 수 없어.
* 그러면 int에 1byte 값을 담자!
* 00000000 00000000 00000000 00000000
* 00000000 00000000 00000000 11111111
* EOF는 -1로 하자!!
* 1은?
* 00000000 00000000 00000000 00000001
* 1의 보수는?
* 11111111 11111111 11111111 11111110
* 1의 보수에 1을 더해주면 2의 보수가 됨.
* 2의 보수는?
* 11111111 11111111 11111111 11111111 : -1
 * */
public class InputStreamExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            int data = in.read();//byte단위로 읽어들이는 read메소드가 byte를 리턴하지 않고 int를 리턴하느냐?
            //EOF를 표현할 수 있는 방법이 없어서
            //바이트로 리턴되는 모든 값들은 입력대상이니까 그 후는 입력할 방법이 없자나.
        } catch (IOException ex) {
            System.out.println("io 오류: " + ex);
        } finally {
            try {
                in.close();

            } catch (Exception ex2) {
                System.out.println("io 오류2: " + ex2);
            }

        }
    }
}

