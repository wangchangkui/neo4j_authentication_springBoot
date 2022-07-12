package com.myxiaowang.neo4j.service;

import com.myxiaowang.neo4j.entity.User;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 11:37:00
 */
public interface UserService {


    /**
     * 通过id删除 用户
     * @param id id 此Id是通过CommonIdGenerator.Class 生成的id
     * @return 删除的用户
     */
    User deleteUserById(String id);
    /**
     * 根据Id查询用户
     * @param id  id 此Id是通过CommonIdGenerator.Class 生成的id
     * @return null or User
     */
    User findUserById(String id);

    /**
     * 插入一个用户 id 自动生成
     * @param user 对象
     * @return 操作结果
     */
    User insertUser(User user);
}
