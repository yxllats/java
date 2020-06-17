import java.sql.*;

/**
 * Author: dts
 * DateTime: 2020/6/9 10:17
 * Description: TODO
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String defaultDatabaseName = "yxllats";
        String password = "1211";
        String user = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/" + defaultDatabaseName + "?useSSL=false&characterEncoding=utf8";
        Connection connection = DriverManager.getConnection(url,user,password);

        Statement statement = connection.createStatement();
        String sql = "select * from exam_result";
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;
        while (resultSet.next()){
            String id = resultSet.getString(1);
            String name = resultSet.getString(2);
            String chinese = resultSet.getString(3);
            String math = resultSet.getString(3);
            String english = resultSet.getString(3);
            System.out.format("| %2s | %4s | %9s | %3s |%n", id,  name, chinese,math,english);
            count++;
        }
        System.out.println("+----+------+-----------+-----+");
        System.out.format("%d rows in set", count);

        resultSet.close();
        statement.close();
        connection.close();
    }
}
