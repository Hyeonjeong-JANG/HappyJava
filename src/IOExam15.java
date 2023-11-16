import java.io.StringWriter;

public class IOExam15 {
    public static void main(String[] args) throws Exception {
        StringWriter out = new StringWriter();
        out.write("hello ");
        out.write("world ");
        out.write("!!!");
        out.close();

        String str = out.toString();//toString메소드로 저장한 데이터를 몽땅 가져옴.
        System.out.println(str);
    }
}