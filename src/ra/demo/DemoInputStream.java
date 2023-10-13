package ra.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoInputStream {
    // Chương trình đọc được file đã tạo từ DemoOutputStream
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        DataInputStream inputStream = new DataInputStream(fileInputStream);

        System.out.println("Đọc từ file data.txt");
        System.out.println(inputStream.readInt());;
        System.out.println(inputStream.readUTF());;
        System.out.println(inputStream.readBoolean());;
        System.out.println(inputStream.readDouble());;

    }
}
