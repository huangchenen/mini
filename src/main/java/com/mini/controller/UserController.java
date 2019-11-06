package com.mini.controller;


import com.alibaba.fastjson.JSONObject;
import com.mini.entity.User;
import com.mini.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    @ResponseBody
    public String getAllUsers(){
        List<User> userList = userService.getUserList();
        return JSONObject.toJSONString(userList);
    }
}
