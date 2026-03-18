package JavaWeb.day04;

import java.io.*;
import java.net.Socket;

public class HttpRequest {
    private InputStream in ;
    private String uri;

    public HttpRequest(InputStream in) {
        this.in = in;
    }

    public String getUri() {
        return uri;
    }

    public void request() {
        StringBuffer sb = new StringBuffer();

        int len = 0;
        byte[] buf = new byte[1024];
        try {
            len=this.in.read(buf);
            for(int i=0;i<len;i++){
                sb.append((char)buf[i]);
            }
            uri = getUri(sb.toString());
//            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUri(String requestURI) {
        int index1 =requestURI.indexOf(" ");
        int index2 =requestURI.indexOf(" ",index1+1);
        String uri = requestURI.substring(index1+1,index2);
        return uri;
    }
}
