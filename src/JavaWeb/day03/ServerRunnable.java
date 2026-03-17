package JavaWeb.day03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ServerRunnable implements  Runnable {
    private Socket socket;

    public ServerRunnable(Socket socket) {
        this.socket=socket;
    }
    @Override
    public void run() {
        InputStream in = null;
        DataInputStream din = null;
        OutputStream out = null;
        DataOutputStream dos = null;
        Scanner scanner = new Scanner(System.in);
        String message=null;
        String name = "客户端";
        while(true){
            try {
//                接收信息
//                in = this.socket.getInputStream();
//                din = new DataInputStream(in);
//                message=din.readUTF();
//                System.out.println("客户端："+ message);
                InputRunner InputRun=new InputRunner(this.socket,in,din,message,name);
                new Thread(InputRun).start();
//                发送信息
                System.out.print("服务器：");
                message=scanner.nextLine();
                OutRunnable outRun =new OutRunnable(out,dos,socket,message,name);
                new Thread(outRun).start();
//                out =socket.getOutputStream();
//                dos = new DataOutputStream(out);
//                dos.writeUTF(message);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
