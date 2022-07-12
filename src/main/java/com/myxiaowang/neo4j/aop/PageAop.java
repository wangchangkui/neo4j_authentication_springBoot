package com.myxiaowang.neo4j.aop;

import com.myxiaowang.neo4j.entity.requset.RequestDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 15:21:00
 */
@Component
@Aspect
public class PageAop {

    @Pointcut("@annotation(com.myxiaowang.neo4j.aop.annotation.PageAnnotation)")
    public void cutMethod(){

    }


    @Before("cutMethod()")
    public void before(JoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Object arg = args[0];
        if(arg instanceof RequestDto){
            RequestDto requestDto = (RequestDto) arg;
            requestDto.fixRequest(requestDto.page, requestDto.size);
            args[0] = requestDto;
        }
    }

}
