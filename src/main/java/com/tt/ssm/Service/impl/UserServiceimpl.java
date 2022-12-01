package com.tt.ssm.Service.impl;

import com.tt.ssm.Mapper.UserMapper;
import com.tt.ssm.Service.UserService;
import com.tt.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
    @Autowired UserMapper userMapper;

    public User get_user() {
        return userMapper.get_user();
    }
}
