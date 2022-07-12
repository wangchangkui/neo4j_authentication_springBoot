package com.myxiaowang.neo4j.controller;

import com.myxiaowang.neo4j.entity.Role;
import com.myxiaowang.neo4j.entity.User;
import com.myxiaowang.neo4j.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 14:24:00
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @PostMapping("/insert")
    public Role insertUser(@RequestBody Role role){
        return roleService.insertRole(role);
    }

}
