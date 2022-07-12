package com.myxiaowang.neo4j.service.impl;

import com.myxiaowang.neo4j.entity.User;
import com.myxiaowang.neo4j.rep.UserRep;
import com.myxiaowang.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 11:38:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRep rep;


    @Override
    public User deleteUserById(String id) {
        Optional<User> user = rep.findById(id);
        rep.deleteById(id);
        return user.orElse(null);
    }

    @Override
    public User findUserById(String id) {
        Optional<User> user = rep.findById(id);
        return user.orElse(null);
    }

    @Override
    public User insertUser(User user) {
        return rep.save(user);
    }
}
