package com.mini.service.impl;

import com.mini.dao.UserDao;
import com.mini.entity.User;
import com.mini.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        List<User> users = userDao.selectAllUsers();
        System.out.println("查询的结果为："+users);
        return users;
    }
}
