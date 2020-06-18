package blog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Author: dts
 * DateTime: 2020/6/10 18:16
 * Description: TODO
 */
public class UserLoginAction implements Action {
    @Override
    public void run() throws SQLException {
        System.out.println("开始用户登录 ...");
        System.out.println();

        // 读取用户输入的信息
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名> ");
        String username = scanner.nextLine();
        System.out.print("请输入密码> ");
        String password = scanner.nextLine();

        try(Connection connection = DBUtil.getConnection()){
            String sql = "select id, nickname from users where username = ? and password = ?";
            try(PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setString(1,username);
                statement.setString(2,password);

                try(ResultSet resultSet = statement.executeQuery()){
                    if(resultSet.next()){
                        int id = resultSet.getInt(1);
                        String nickname = resultSet.getString(2);
                        User user = new User();
                        user.id = id;
                        user.username = username;
                        user.nickname = nickname;

                        User.login(user);
                    }else {
                        System.out.println("** 用户名或者密码错误，请重新输入!!");
                    }
                }
            }
        }catch (SQLException e){
            System.out.println("错误"+e.getMessage());
        }
    }
}


