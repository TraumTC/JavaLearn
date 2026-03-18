package JavaWeb.day04;

import org.apache.tomcat.websocket.WrappedMessageHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class HttpResponse {
    private OutputStream out;

    public HttpResponse(OutputStream out) {
        this.out = out;
    }

    public void sendResponse(HttpRequest request) throws Exception {

        String uri = request.getUri();
        if(uri.equals("/")) uri = "hello.html";
//       判断URI是否存在
//       获取工程的绝对路径
        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "\\web";
        File file = new File(path,uri);
        if(file.exists()){
            FileInputStream fis = new FileInputStream(file);
            byte[] b = new byte[(int) file.length()];
            fis.read(b);
            String result = new String(b);
            result = warpMessage("200",result);
            out.write(result.getBytes());
        }
        else{
            String errorMessage = warpMessage("404", "404 File Not Found! The requested URL /404/ was not found on this server.");
            out.write(errorMessage.getBytes());
        }
    }
//    浏览器接收服务器响应资源时，必须遵循 HTTP 固定的格式，对输出流进行封装
    public String warpMessage(String code,String message){
        return "HTTP/1.1 "+code+"\r\n"+"Content-Type: text/html\r\n"+"Content-Length: "+message.length()
                +"\r\n"+"\r\n"+message;
    }

}
