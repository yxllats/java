import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: dts
 * DateTime: 2020/7/5 10:46
 * Description: TODO
 */
public class MyFirstDynamicResource extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String target = req.getParameter("target");
        String name = req.getParameter("name");
        String age = req.getParameter("age");

        if(target!=null) {
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter writer = resp.getWriter();

            writer.println("<p>Hello "+ target+"</p>");
        }else {
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter writer = resp.getWriter();

            writer.println("<p>再见"+name+","+"年龄"+age+"</p>");
        }
    }
}
