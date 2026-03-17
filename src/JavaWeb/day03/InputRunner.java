package JavaWeb.day03;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class InputRunner implements Runnable {
    private Socket socket;
    private InputStream in;
    private DataInputStream din;
    private String message;
    private String name;

    public InputRunner(Socket socket, InputStream in, DataInputStream din, String message, String name) {

        this.socket = socket;
        this.in = in;
        this.din = din;
        this.message = message;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                in = this.socket.getInputStream();
                din = new DataInputStream(in);
                message=din.readUTF();
                System.out.println("\r" + this.name +":"+ message);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
