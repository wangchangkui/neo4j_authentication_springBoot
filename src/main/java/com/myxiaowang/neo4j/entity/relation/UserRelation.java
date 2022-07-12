package com.myxiaowang.neo4j.entity.relation;

import com.myxiaowang.neo4j.entity.Role;
import com.myxiaowang.neo4j.entity.User;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.RelationshipId;
import org.springframework.data.neo4j.core.schema.RelationshipProperties;

/**
 * @author wck
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年05月23日 15:27:00
 */
@Data
@RelationshipProperties
public class UserRelation {

    @RelationshipId
    private Long id;
}
