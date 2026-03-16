package JavaWeb.day01;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            socket = new Socket("localhost", 8080);
            System.out.println("---客户端---");
            String request = "吃饭了吗！";
            System.out.println("客户端说：" + request);
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(request);
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);
            String response = dataInputStream.readUTF();
            System.out.println("服务端响应为：" + response);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataInputStream.close();
                inputStream.close();
                dataOutputStream.close();
                outputStream.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
