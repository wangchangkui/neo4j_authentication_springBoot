package com.myxiaowang.neo4j.rep;

import com.myxiaowang.neo4j.entity.Role;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 14:24:00
 */
@Component
public interface RoleRep  extends Neo4jRepository<Role,String>, PagingAndSortingRepository<Role,String> {

}
