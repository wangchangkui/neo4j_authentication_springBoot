package com.myxiaowang.neo4j.config;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年06月23日 15:09:00
 */
public interface RoleConfig {

    /**
     * 增加角色关系名称接口
     * @param roleRelationShipName  关系名称
     */
    void addRoleName(String roleRelationShipName);

    /**
     * 增加用户角色关系名称接口
     * @param userRoleRelationShipName 角色关系名称
     */
    void addUserRoleName(String userRoleRelationShipName);

    /**
     * 删除角色关系名称接口
     * @param roleRelationShipName 关系名称
     */
    void deleteRoleName(String roleRelationShipName);

    /**
     * 删除用户角色关系名称接口
     * @param userRoleRelationShipName 关系名称
     */
    void deleteUserRoleName(String userRoleRelationShipName);

}
