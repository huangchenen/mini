package com.mini.dao;


import com.mini.entity.User;

import java.util.List;

public interface UserDao {
    List<User> selectAllUsers();
}
