package com.myxiaowang.neo4j.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.*;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wck
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年05月23日 14:35:00
 */
@Data
@Node("user")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Property("userName")
    private String name;

    @Property("email")
    private String email;

    @Property("age")
    private Integer age;
}
