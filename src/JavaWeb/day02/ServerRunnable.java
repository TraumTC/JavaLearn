package JavaWeb.day02;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerRunnable implements Runnable {
    private Socket socket;

    public ServerRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        try {
            inputStream=this.socket.getInputStream();
            dataInputStream=new DataInputStream(inputStream);
            String message=dataInputStream.readUTF();
            System.out.println("服务器接收到了信息"+ message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                inputStream.close();
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
