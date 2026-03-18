package JavaWeb.day05;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/my")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "Tom";
//        req.setAttribute("name",name);
//        req.getRequestDispatcher("test.jsp").forward(req,resp);

        HttpSession session = req.getSession();
        session.setAttribute("name",name);

        resp.sendRedirect("test.jsp?names=TTC");

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Post,进行业务逻辑的处理");
    }
}
