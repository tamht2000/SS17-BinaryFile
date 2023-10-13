package ra.demo.serialize.models;

import java.io.*;

public class DemoDeserialization {
    public static void main(String[] args){
        System.out.println("Đọc từ file student.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream("student.txt");

            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

            Student student = (Student) inputStream.readObject();

            while (true){

                System.out.println(student);
                student = (Student) inputStream.readObject();
            }

        } catch (EOFException e) {
            System.out.println("Quá trình đọc file kết thúc");
        } catch (IOException e) {
            System.out.println("Đã có lỗi xảy ra khi đọc file");
        }catch (ClassNotFoundException e) {
            System.out.println("Định dạng dữ liệu không phù hợp");
        }

    }
}
