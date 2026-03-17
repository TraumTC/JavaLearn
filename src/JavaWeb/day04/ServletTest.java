package JavaWeb.day04;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/test")
public class ServletTest implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest Request, ServletResponse Response) throws ServletException, IOException {
        String id = Request.getParameter("id");
        System.out.println("浏览器传来的参数为" + id);
        String message = "hello world";
        Response.getWriter().write(message);


//        System.out.println("在浏览器中打开了ServletTest");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
