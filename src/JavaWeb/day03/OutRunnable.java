package JavaWeb.day03;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

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
                    dout = new DataOutputStream(out);
                    dout.writeUTF(message);
                }
//                String name1 = "";
//                if(this.name=="服务器") name1="客户端";
//                if(this.name=="客户端") name1="服务器";

                message="";
//                System.out.print(name1+":");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
