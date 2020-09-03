package dts.dao;

import dts.model.User;
import dts.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class UserDAO {
    public static User query(User u) {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User query = null;
        try {
            c = DBUtil.getConnection();
            String sql = "select id,  nickname, email, create_time from user where username=? and password=?";

            ps = c.prepareStatement(sql);
            ps.setString(1,u.getUsername());
            ps.setString(2,u.getPassword());

            rs = ps.executeQuery();

            while (rs.next()) {
                query = u;
                query.setId(rs.getInt("id"));
                query.setNickname(rs.getString("nickname"));
                query.setEmail(rs.getString("email"));
                query.setCreateTime(new Date(rs.getTimestamp("create_time").getTime()));
            }
            return query;
        } catch (Exception e) {
            throw new RuntimeException("登录出错详情出错", e);
        } finally {
            DBUtil.close(c, ps, rs);
        }
    }
}
