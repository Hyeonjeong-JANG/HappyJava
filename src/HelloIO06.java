import java.io.*;

public class HelloIO06 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\hyeon\\IdeaProjects\\HappyJava\\my.txt")));
//        String line1=in.readLine();//hello
//        String line2=in.readLine();//world
//        String line3=in.readLine();//!!!
//        String line4=in.readLine();//null
//
//        System.out.println(line1);
//        System.out.println(line2);
//        System.out.println(line3);
//        System.out.println(line4);

        String line = null;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
