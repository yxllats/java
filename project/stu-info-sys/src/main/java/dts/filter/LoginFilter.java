package dts.filter;

import dts.model.Response;
import dts.util.JSONUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        String uri = req.getServletPath();
        HttpSession session = req.getSession(false);
        if(session==null) {
            //首页重定向到登陆页面，如果后端接口，返回错误的json数据

            if ("/public/page/main.html".equals(uri)) {
                resp.setContentType("text/html;charset=UTF-8");
                String scheme = req.getScheme();
                String host = req.getServerName();
                int port = req.getServerPort();
                String ctx = req.getContextPath();

                String basePath = scheme+"://"+host+":"+port+ctx;
                resp.sendRedirect(basePath+"/public/index.html");
                return;
             //请求后端非登录接口：未登录不允许访问的请求，一般返回401状态码
            } else if (!uri.startsWith("/public/")
                    && !uri.startsWith("/static/") && !"/user/login".equals(uri)) {
                resp.setContentType("application/json");
                PrintWriter pw =resp.getWriter();
                Response r = new Response();
                r.setCode("ERR401");
                r.setMessage("不允许访问");
                resp.setStatus(401);
                pw.println(JSONUtil.write(r));
                pw.flush();
                return;
            }
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
