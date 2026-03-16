package JavaWeb.day02;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务器已启动......");
        while (true) {
//            等待接受客户端请求
            Socket socket = serverSocket.accept();
            ServerRunnable serverRunnable = new ServerRunnable(socket);
            new Thread(serverRunnable).start();
        }
    }
}
