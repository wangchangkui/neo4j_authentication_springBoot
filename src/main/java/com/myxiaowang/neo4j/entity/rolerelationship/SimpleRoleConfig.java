package com.myxiaowang.neo4j.entity.rolerelationship;

import java.util.List;

/**
 * @author wck
 * @version 1.0.0
 * @Description 这个类应该封装一些对集合的操作
 * @createTime 2022年06月23日 15:36:00
 */
public class SimpleRoleConfig extends AbstractRoleConfig {

    public List<String> getAllRoleNames(){
        return SimpleRoleConfig.ROLE_NAME_LIST;
    }

    @Override
    public boolean hasUserRole(String userRoleName) {
        return SimpleRoleConfig.ROLE_NAME_LIST.contains(userRoleName);
    }

    @Override
    public boolean hasRole(String roleName) {
        return  SimpleRoleConfig.ROLE_NAME_LIST.contains(roleName);
    }
}
