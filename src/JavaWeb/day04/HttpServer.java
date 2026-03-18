package JavaWeb.day04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
    private int port = 8080;

    public void start(){
        ServerSocket servletSocket = null;
        try {
            servletSocket = new ServerSocket(port,1, InetAddress.getByName("127.0.0.1"));
            System.out.println("服务器已启动......");
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true){
            Socket socket = null;
            InputStream in = null;
            OutputStream out = null;
            try {
                socket = servletSocket.accept();
                in = socket.getInputStream();
                out = socket.getOutputStream();
//            请求解析 request
                HttpRequest request = new HttpRequest(in);
                request.request();
//            做出响应response
                HttpResponse response = new HttpResponse(out);
                response.sendResponse(request);
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    in.close();
                    out.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        }
    }

}
