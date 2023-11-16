import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExam13 {
    public static void main(String[] args) throws Exception {
        int data1 = 1;
        int data2 = 2;
        ByteArrayOutputStream out = new ByteArrayOutputStream();//ByteArrayOutputStream으로 저장하면 메모리상에 저장이 된다.
        out.write(data1);//data1의 마지막 1byte만 저장한다.
        out.write(data2);
        out.close();

        byte[] array = out.toByteArray();//toByteArray를 해주면 메모리상에 저장된 데이터를 리턴해준다.
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}