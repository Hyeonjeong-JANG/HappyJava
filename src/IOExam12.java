import java.io.*;

public class IOExam12 {
    public static void main(String[] args) throws Exception {
        // 문제. 이름, 국어, 영어, 수학 점수를 score.dat 파일에서 읽어들이시오.
        DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\hyeon\\IdeaProjects\\HappyJava\\score.txt"));
        printStudent(in);
        printStudent(in);

        in.close();
        //두 사람의 정보를 가져오고 싶다? 그러면 위와 같은 방식으로 반복하면 되는데
    }

    private static void printStudent(DataInputStream in) throws IOException {
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total= in.readDouble();
        double avg= in.readDouble();

        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(total);
        System.out.println(avg);
    }
}
