package JavaWeb.day02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class TerminalA {
    static void main(String[] args) throws Exception {
//        发送信息
        System.out.print("请输入要发送的消息:");
        Scanner sc = new Scanner(System.in);
        String message =sc.nextLine();
//        System.out.println(message);
        DatagramSocket socket = new DatagramSocket(8080);
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(
                message.getBytes(),
                message.getBytes().length,
                address, 8181);
        socket.send(packet);
//        接受信息
        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
        System.out.println("等待接收回复的消息.....");
        socket.receive(dp);
        String data = new String(dp.getData(), 0, dp.getLength());
        System.out.println("我是A，接收到了   " + dp.getPort() + "   回复的消息: " + data);
        socket.close();

    }
}
