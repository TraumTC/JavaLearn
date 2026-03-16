package JavaWeb.day02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Scanner;

public class TerminalB {
    static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8181);
//        InetAddress address = InetAddress.getByName("localhost");
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        System.out.println("等待接收信息......");
        socket.receive(packet);
        byte[] data = packet.getData();
        String message = new String(data, 0,packet.getLength());
        System.out.println("我是B，接收到了：" + packet.getPort() + "  发来的消息:" + message);
        System.out.print("请输入用于回复的消息：");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        SocketAddress address = packet.getSocketAddress();
        DatagramPacket packet1=new DatagramPacket(input.getBytes(),input.getBytes().length,address);
        socket.send(packet1);


    }
}
