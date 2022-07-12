package com.myxiaowang.neo4j.controller;

import com.myxiaowang.neo4j.entity.User;
import com.myxiaowang.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月23日 14:32:00
 */

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @DeleteMapping("/batchDeleteUser")
    public List<User> deleteUsers(){
        return userService.deleteBatchUsers();
    }

    @GetMapping("/list")
    public List<User> getListUser(){
        return userService.listUser();
    }

    @PostMapping("/updateUser")
    public User updateUserById(@RequestBody User user){
        return userService.updateUser(user);
    }

    @GetMapping("/userById/{id}")
    public User userById(@PathVariable String id){
      return userService.findUserById(id);
    }


    @PostMapping("/insert")
    public User insertUser(@RequestBody User user){
      return userService.insertUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public User deleteUserById(@PathVariable String id)
    {
        return userService.deleteUserById(id);
    }
}
