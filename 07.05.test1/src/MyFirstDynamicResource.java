import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: dts
 * DateTime: 2020/7/5 9:47
 * Description: TODO
 */
public class MyFirstDynamicResource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String target = req.getParameter("target");

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();

        //writer.println("<h1>我是/s资源</h1>");
        writer.println("<p>Hello "+target+"</p>");
    }
}
