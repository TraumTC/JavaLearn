package JavaWeb.day03;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

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
                StringBuffer sb = new StringBuffer();
                byte[] b = new byte[1024];
                int len;
                len=in.read(b);
                sb.append(new String(b,0,len));
                System.out.println("\r" + this.name +":"+ sb);

//                din = new DataInputStream(in);
//                message=din.readUTF();
//                if(!message.equals("")){
//                    System.out.println("\r" + this.name +":"+ message);
//                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
