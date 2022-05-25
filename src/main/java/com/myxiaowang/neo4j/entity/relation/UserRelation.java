package com.myxiaowang.neo4j.entity.relation;

import com.myxiaowang.neo4j.entity.User;
import lombok.Data;

/**
 * @author wck
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年05月23日 15:27:00
 */
@Data
public class UserRelation {

    private User startUser;

    private User endUser;
}
