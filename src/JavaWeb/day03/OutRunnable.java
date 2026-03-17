package JavaWeb.day03;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class OutRunnable implements Runnable {
    private OutputStream out;
    private DataOutputStream dout;
    private Socket socket;
    private String message;
    private String name;


    public OutRunnable(OutputStream out, DataOutputStream dout, Socket socket, String message,String name) {

        this.out = out;
        this.dout = dout;
        this.socket = socket;
        this.message = message;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (message != "") {
                    out =socket.getOutputStream();
//                    dout = new DataOutputStream(out);
                    out.write(message.getBytes((StandardCharsets.UTF_8)));
                    out.flush();
                }
                message="";
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
