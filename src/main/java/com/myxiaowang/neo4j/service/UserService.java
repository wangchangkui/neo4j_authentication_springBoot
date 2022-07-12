package com.myxiaowang.neo4j.service;

import com.myxiaowang.neo4j.entity.User;
import com.myxiaowang.neo4j.entity.requset.RequestDto;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 11:37:00
 */
public interface UserService {


    /**
     * 当你受够了直接使用封装好的方法
     * 你可以去Rep类下面操作原始的指令
     * ————————————————
     *
     * 通过指令的方式删除角色的关系
     *
     * @param roleId 角色
     * @param userId 用户
     * @return User
     */
    User deleteUserRelationByRep(String roleId, String userId);

    /**
     *  删除用户指定的角色
     * @param roleId 角色id
     * @param userId 用户id
     * @return user
     */
    User deleteUserRelation(String roleId, String userId);
    /**
     * 给指定用户添加映射关系
     * @param roleId 角色id
     * @param userId 用户Id
     * @return User
     */
    User addRelaShip(String roleId, String userId);
    /**
     * 批量删除用户
     * @return list of users
     */
    List<User> deleteBatchUsers();

    /**
     * 更新用户信息
     * @param user 更新的对象 需要携带Id
     * @return user
     */
    User updateUser(User user);

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

    /**
     * 获取所有的节点
     * @return list of user
     */
    List<User> listUser();


    /**
     * 分页查询用户
     * @param requestDto 支持扩展的请求对象
     * @return User of List
     */
    Page<User> userByPage(RequestDto requestDto);



}
