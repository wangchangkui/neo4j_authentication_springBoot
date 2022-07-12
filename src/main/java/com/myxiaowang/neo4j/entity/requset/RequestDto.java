package com.myxiaowang.neo4j.entity.requset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 14:58:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {
    public Integer page;
    public Integer size;
    public void fixRequest(Integer page, Integer size) {
        if(page == 0){
            page++;
        }
        this.page = (page - 1) * size;
        this.size = ((page - 1) * size) + size;
    }
}
