package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.User;
import com.example.demo.repository.UserDao;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserImpl extends ServiceImpl<UserDao, User> implements UserService {
}
