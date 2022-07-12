package com.myxiaowang.neo4j.entity;

import com.myxiaowang.neo4j.config.CommonIdGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * @author wck
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年05月23日 14:35:00
 */
@Data
@Node("user")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(value = CommonIdGenerator.class)
    private String id;

    @Property("userName")
    private String name;

    @Property("email")
    private String email;

    @Property("age")
    private Integer age;


    public User(String id ,String name, String email, Integer age) {
        this.name = name;
        this.id =id;
        this.email = email;
        this.age = age;
    }

}
