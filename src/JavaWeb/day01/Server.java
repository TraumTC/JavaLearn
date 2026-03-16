package JavaWeb.day01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            serverSocket = new ServerSocket(8080);
            System.out.println("---服务端---");
            System.out.println("已启动，等待接收客户端请求...");
            while (true){
                socket = serverSocket.accept();
                inputStream = socket.getInputStream();
                dataInputStream = new DataInputStream(inputStream);
                String request = dataInputStream.readUTF();
                System.out.println("接收到了客户端请求：" + request);
                String response = "Hello World";
                System.out.println("给客户端做出响应：" + response);
                outputStream = socket.getOutputStream();
                dataOutputStream = new DataOutputStream(outputStream);
                dataOutputStream.writeUTF(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
                outputStream.close();
                dataInputStream.close();
                inputStream.close();
                socket.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
