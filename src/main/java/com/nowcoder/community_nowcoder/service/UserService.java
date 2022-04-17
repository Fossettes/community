package com.nowcoder.community_nowcoder.service;

import com.nowcoder.community_nowcoder.dao.UserMapper;
import com.nowcoder.community_nowcoder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

}
