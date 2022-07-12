package com.myxiaowang.neo4j.config;

import cn.hutool.core.util.IdUtil;
import org.springframework.data.neo4j.core.schema.IdGenerator;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 11:25:00
 */

@Component
public class CommonIdGenerator implements IdGenerator<String> {


    @Override
    public String generateId(String primaryLabel, Object entity) {
        // primaryLabel 通常表示标签名称
        return StringUtils.uncapitalize(primaryLabel) +
                "-" + IdUtil.fastSimpleUUID();
    }
}
