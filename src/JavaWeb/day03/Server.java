package JavaWeb.day03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
//            启动服务端，监听8080端口
            serverSocket = new ServerSocket(8080);
            System.out.println("服务器已启动......");
            while (true) {
//             等待客户链接
                socket = serverSocket.accept();
                ServerRunnable serverRunnable=new ServerRunnable(socket);
                new Thread(serverRunnable).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
