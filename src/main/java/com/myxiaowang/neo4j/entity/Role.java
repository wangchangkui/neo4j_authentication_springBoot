package com.myxiaowang.neo4j.entity;

import com.myxiaowang.neo4j.config.CommonIdGenerator;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 14:17:00
 */
@Node("role")
public class Role {
    @Id
    @GeneratedValue(value = CommonIdGenerator.class)
    private String roleId;

    @Property("role_name")
    private String roleName;
}
