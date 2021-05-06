package com.atguigu.springcloud.aop;

import com.atguigu.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/13 17:18
 */
@Component
@Slf4j
@Aspect
public class ExceptTransactionalAop {
    @Around(value = "@annotation(com.atguigu.springcloud.aop.MyTransactional)")
     public Object  around (ProceedingJoinPoint proceedingJoinPoint){
        try {
            log.info(">>进入自定义注解");
            Object proceed = proceedingJoinPoint.proceed();
            return proceed;
        } catch (Throwable throwable) {
//            throwable.printStackTrace();
            return new CommonResult(500, "错误错误");
        }
    }
}
