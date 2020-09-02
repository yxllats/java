package com.dts.service;

import com.dts.dao.UserDao;
import com.dts.model.User;

import java.sql.SQLException;


public class UserService {
    private UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }

    public User register(String username, String password) throws SQLException {
        return userDao.insert(username, password);
    }

    public User login(String username, String password) throws SQLException {
        return userDao.select(username, password);
    }
}
