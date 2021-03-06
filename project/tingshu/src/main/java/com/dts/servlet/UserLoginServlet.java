package com.dts.servlet;

import com.dts.model.User;
import com.dts.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {
    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");


        try {
            User user = userService.login(username, password);
            if (user == null) {
                // 没有注册成功
                resp.sendRedirect("/login.html");
                return;
            }

            // 访问资源时携带的登陆用户信息
            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            // 跳转回首页
            resp.sendRedirect("/");
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
