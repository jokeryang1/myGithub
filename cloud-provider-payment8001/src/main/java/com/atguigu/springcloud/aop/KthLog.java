package com.atguigu.springcloud.aop;

import java.lang.annotation.*;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description 王峰我
 * @email banana_yang@outlook.com
 * @date 2021/4/13 17:15
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface KthLog {
    String value() default  "";

}
