import java.sql.*;

/**
 * Author: dts
 * DateTime: 2020/6/5 19:15
 * Description: TODO
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动 —— 选择了乙方
        Class.forName("com.mysql.jdbc.Driver");

        /**
         * 完整的目标是执行 select * from student_0604;
         */

        // 建立数据库连接

        // 写明 MySQL 服务端所在地
        // 以后写项目，只需要修改默认数据库名称即可
        String defaultDatabaseName = "yxllats";
        // 填写你自己的 MySQL 密码，每个同学都不太一样
        String password = "1211";

        // 下面这里，基本上不变
        String user = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/" + defaultDatabaseName + "?useSSL=false&characterEncoding=utf8";

        Connection connection = DriverManager.getConnection(url, user, password);
        // 打印 connection 对象，验证是否连接成功
        System.out.println(connection);

        Statement statement = connection.createStatement();
        String sql = "select * from exam_result";  // 没有要求必须分号结尾了
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;
        System.out.println("+----+------+-----------+-----+");
        System.out.println("| id | name   | math      | english |");
        System.out.println("+----+------+-----------+-----+");
        while (resultSet.next()) {
            String id = resultSet.getString(1);
            String name = resultSet.getString(2);
            String math = resultSet.getString(3);
            String english = resultSet.getString(4);

            System.out.format("| %2s | %4s | %9s | %3s |%n", id, name, math, english);
            count++;
        }
        System.out.println("+----+------+-----------+-----+");
        System.out.format("%d rows in set", count);
        // -3. 关闭 resultSet 对象
        resultSet.close();
        // -2. 关闭 statement 对象
        statement.close();

        // -1. 关闭刚才的连接
        connection.close();
    }
}
