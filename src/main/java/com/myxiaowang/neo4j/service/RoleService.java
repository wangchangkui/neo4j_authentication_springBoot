package com.myxiaowang.neo4j.service;

import com.myxiaowang.neo4j.entity.Role;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 14:37:00
 */
public interface RoleService {
    /**
     * 添加权限
     * @param role 权限信息
     * @return role
     */
    Role insertRole(Role role);
}
