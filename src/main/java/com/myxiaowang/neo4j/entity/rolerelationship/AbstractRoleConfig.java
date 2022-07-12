package com.myxiaowang.neo4j.entity.rolerelationship;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年06月23日 15:11:00
 */
@Slf4j
public abstract class AbstractRoleConfig implements RoleConfig {

    /**
     * 定义存储角色之间的关系
     */
    protected final  static CopyOnWriteArrayList<String> ROLE_NAME_LIST =new CopyOnWriteArrayList<>();

    /**
     * 定义存储用户与角色之间的关系
     */
    protected final static CopyOnWriteArrayList<String> USER_ROLE_NAME_LIST =new CopyOnWriteArrayList<>();

    static {
        // 预先存储部分存在的角色关系
        ROLE_NAME_LIST.add("contain");
        // 存储用户角色之间的关系
        USER_ROLE_NAME_LIST.add("hasRole");
    }

    public boolean hasUserRole(String userRoleName){
        throw new RuntimeException("调用子类的实现方法");
    }

    public boolean hasRole(String roleName){
        throw new RuntimeException("调用子类的实现方法");
    }

    public static List<String> getRoleNameList(){
        return ROLE_NAME_LIST;
    }

    public static List<String> getUserRoleNameList(){
        return USER_ROLE_NAME_LIST;
    }

    @Override
    public void addRoleName(String roleRelationShipName) {
        AbstractRoleConfig.ROLE_NAME_LIST.add(roleRelationShipName);
    }

    @Override
    public void addUserRoleName(String userRoleRelationShipName) {
        AbstractRoleConfig.USER_ROLE_NAME_LIST.add(userRoleRelationShipName);
    }

    @Override
    public void deleteRoleName(String roleRelationShipName) {
        try{
            AbstractRoleConfig.ROLE_NAME_LIST.remove(roleRelationShipName);
        }catch (Exception e){
            e.printStackTrace();
            log.error("不存在这个角色关系");
        }
    }

    @Override
    public void deleteUserRoleName(String userRoleRelationShipName) {
        try{
            AbstractRoleConfig.USER_ROLE_NAME_LIST.remove(userRoleRelationShipName);
        }catch (Exception e){
            e.printStackTrace();
            log.error("不存在这个用户角色关系");
        }
    }
}
