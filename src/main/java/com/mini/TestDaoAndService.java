package com.mini;

import com.mini.entity.User;
import com.mini.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestDaoAndService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-web.xml");
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService);
        List<User> userList = userService.getUserList();
        System.out.println(userList);
    }
}
