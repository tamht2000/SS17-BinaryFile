package ra.btvd;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Tâm", "tamht2000", true));
        users.add(new User(2, "Khanh", "khanh2000", true));
        users.add(new User(3, "Hoàng", "hoang2000", true));

        // Ghi dữ liệu vào file user.dat
        File file = new File("user.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(users);
        outputStream.close();
        System.out.println("Ghi file thành công");

        // Đọc dữ liệu từ file user.dat
        FileInputStream inputStream = new FileInputStream("user.dat");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        List<User> users2 = (List<User>) ois.readObject();

        // Hiển thị thông tin người dùng và ghi vào file user.txt
        File file2 = new File("user.txt");
        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (User user : users2) {
            user.display();
            bufferedWriter.write(user.toString());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        System.out.println("Ghi file user.txt thành công");
    }
}
