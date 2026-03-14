package day17;


import java.io.*;

public class test {
    static void main(String[] args) {
        User user = new User(1,"张三",18);
        OutputStream os = null;
        ObjectOutputStream oos = null;
        try {
//            序列化
            os = new FileOutputStream("src/day17/test.txt");
            oos = new ObjectOutputStream(os);
            oos.writeObject(user);
            os.close();
            oos.close();
//            反序列化.
//            序列化后 文件不能改动，改动之后无法还原。
            InputStream is = new FileInputStream("src/day17/test.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            User user2 = (User)ois.readObject();
            System.out.println(user2);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
