package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        byte[] array = { 10, 20, 30 };
        try {
            OutputStream os = new FileOutputStream("C:/temp/test2.db");
            os.write(array);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}