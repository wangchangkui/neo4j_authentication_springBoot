package com.myxiaowang.neo4j.rep;

import com.myxiaowang.neo4j.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月23日 15:49:00
 */
public interface UserRep extends Neo4jRepository<User,Long> {


}
