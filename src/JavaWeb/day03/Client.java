package JavaWeb.day03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream in = null;
        OutputStream out = null;
        DataInputStream input = null;
        DataOutputStream output = null;
        String message = null;
        System.out.println("客户端已启动......");
        try {
//            链接服务器 ip地址为 本机 端口号 8080
            socket =new Socket("localhost",8080);
            Scanner sc = new Scanner(System.in);
            while(true){
//                发送信息
                System.out.print("客户端：");
                message = sc.nextLine();
                out =socket.getOutputStream();
                output=new DataOutputStream(out);
                output.writeUTF(message);
//                读取消息
                in=socket.getInputStream();
                input=new DataInputStream(in);
                message=input.readUTF();
                System.out.println("服务器：" + message);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
