package ra.demo;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        File output = new File("data.txt");
        if(output.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(output);
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);

            outputStream.writeInt(1000);
            outputStream.writeUTF("hello world");
            outputStream.writeBoolean(true);
            outputStream.writeDouble(3.14);
            outputStream.close();
        } else {
            System.out.println("Có lỗi xảy ra khi thêm mới file");
        }
    }
}
