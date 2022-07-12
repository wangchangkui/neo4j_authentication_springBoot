package com.myxiaowang.neo4j.entity;

import com.myxiaowang.neo4j.config.CommonIdGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.*;

import java.util.Set;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 14:17:00
 */
@Node("role")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {
    @Id
    @GeneratedValue(value = CommonIdGenerator.class)
    private String roleId;

    @Property("role_name")
    private String roleName;

    @Relationship(type = "contain",direction = Relationship.Direction.OUTGOING)
    public Set<Role> roles;
}
