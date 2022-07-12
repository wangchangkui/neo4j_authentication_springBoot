package com.myxiaowang.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

/**
 * @author Myxiaowang
 */
@SpringBootApplication
@EntityScan(value = "com.myxiaowang.neo4j.entity")
@EnableNeo4jRepositories(value = "com.myxiaowang.neo4j.rep")
public class Neo4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(Neo4jApplication.class, args);
    }

}
