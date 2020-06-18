package blog;

//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Author: dts
 * DateTime: 2020/6/10 14:15
 * Description: TODO
 */
public class DBUtil {
    private static DataSource dataSource = null;
    static{
        initDataSource();
    }
    private static void initDataSource(){
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("1211");
        mysqlDataSource.setDatabaseName("huojianban2_boke");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf8");

        dataSource = mysqlDataSource;
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
