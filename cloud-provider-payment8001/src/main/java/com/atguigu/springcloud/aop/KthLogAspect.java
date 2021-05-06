package com.atguigu.springcloud.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.reflect.Modifier;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/13 19:10
 */
@Component
@Aspect
public class KthLogAspect {

    @Pointcut("@annotation(com.atguigu.springcloud.aop.KthLog)")
    public void pointcut(){
        System.out.println("进入切面");
    }

//    @Before("pointcut() && @annotation(log)")
//    public void  advice(KthLog log){
//        System.out.println("日志打印{}" + log.value() );
//    }

    @Before("pointcut() && @annotation(logger)")
    public void advice(JoinPoint joinPoint, KthLog logger) {
        System.out.println("注解作用的方法名: " + joinPoint.getSignature().getName());

        System.out.println("所在类的简单类名: " + joinPoint.getSignature().getDeclaringType().getSimpleName());

        System.out.println("所在类的完整类名: " + joinPoint.getSignature().getDeclaringType());

        System.out.println("目标方法的声明类型: " + Modifier.toString(joinPoint.getSignature().getModifiers()));
    }
}
