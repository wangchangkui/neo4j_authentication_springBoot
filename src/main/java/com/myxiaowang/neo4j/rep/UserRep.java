package com.myxiaowang.neo4j.rep;

import com.myxiaowang.neo4j.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月23日 15:49:00
 */
@Component
public interface UserRep extends Neo4jRepository<User,String>, PagingAndSortingRepository<User,String> {


    /**
     * 通过指令的方式去删除关系
     * @param roleId 角色id
     * @param userId 用户id
     * @return user
     */

    @Deprecated
    @Query(value = "match(n:user{id:$userId})<-[r:hasRole]-(b:role{roleId:$roleId}) delete r return n")
    User deleteRelaShip(@Param("roleId")String roleId,@Param("userId")String userId);
}
