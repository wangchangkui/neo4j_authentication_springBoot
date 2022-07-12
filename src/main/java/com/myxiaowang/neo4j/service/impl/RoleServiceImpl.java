package com.myxiaowang.neo4j.service.impl;

import com.myxiaowang.neo4j.entity.Role;
import com.myxiaowang.neo4j.rep.RoleRep;
import com.myxiaowang.neo4j.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 14:37:00
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRep roleRep;

    @Override
    public Role insertRole(Role role) {
        return roleRep.save(role);
    }
}
