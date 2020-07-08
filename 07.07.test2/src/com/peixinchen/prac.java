package com.peixinchen;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Author: dts
 * DateTime: 2020/7/5 16:43
 * Description: TODO
 */
public class prac {
    private static volatile DataSource dataSource = null;

    public static Connection getConnection() throws SQLException {
        if(dataSource==null){
            synchronized (prac.class){
                if(dataSource == null){
                    dataSource = initDataSource();
                }
            }
        }
        return dataSource.getConnection();
    }

    public static DataSource  initDataSource(){
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setUrl("jdbc:mysql://127.0.0.3306/hjb2_0705?uesSSL=false&characterEncoding=utf-8");
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");

        return mysqlDataSource;
    }
}
