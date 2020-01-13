package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 获取所有用户信息
     * @return
     */
    @RequestMapping("/getUserALL")
    public String getALL(){
        List<User> users=userService.list();
        System.out.printf(users.toString());
        return users.toString();
    }
}
