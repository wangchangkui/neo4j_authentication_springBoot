package com.myxiaowang.neo4j.entity;

import com.myxiaowang.neo4j.config.CommonIdGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年05月23日 14:35:00
 */
@Data
@Node("user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(value = CommonIdGenerator.class)
    private String id;

    @Property("user_name")
    private String name;

    @Property("email")
    private String email;

    @Property("age")
    private Integer age;

    @Property("password")
    private String password;

    @Property("grande")
    private Integer grande;

    public User(String id ,String name, String email, Integer age) {
        this.name = name;
        this.id =id;
        this.email = email;
        this.age = age;
    }

}
