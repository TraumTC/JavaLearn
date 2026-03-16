package JavaWeb.day02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientRunnable implements Runnable{
    private int num;

    public ClientRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        OutputStream os = null;
        DataOutputStream dos = null;
        Socket socket = null;
        try {
            socket = new Socket("localhost",8080);
            String message="你好，我是客户端" + this.num;
            os = socket.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeUTF(message);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                os.close();
                dos.close();
                socket.close();
            } catch (IOException e) {}
        }

    }
}
