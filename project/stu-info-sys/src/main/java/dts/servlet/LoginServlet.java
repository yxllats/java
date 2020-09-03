package dts.servlet;

import dts.dao.UserDAO;
import dts.model.User;
import dts.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user/login")
public class LoginServlet extends AbstractBaseServlet{
    @Override
    protected Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User u = JSONUtil.read(req.getInputStream(),User.class);
        User query = UserDAO.query(u);
        if(query==null){
            throw new RuntimeException("用户名或密码错误");
        }//通过用户名密码查询到用户时，生成session，并将用户保存到session中
        HttpSession session = req.getSession();
        //没有session时，创建一个
        session.setAttribute("user",query);
        return null;
    }
}
