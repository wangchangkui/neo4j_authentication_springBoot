package com.myxiaowang.neo4j.controller;

import com.myxiaowang.neo4j.entity.User;
import com.myxiaowang.neo4j.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月23日 14:32:00
 */

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserRep rep;

    @GetMapping("/userById/{id}")
    public User userById(@PathVariable Long id){
        Optional<User> user = rep.findById(id);
        return user.orElse(null);
    }
}
